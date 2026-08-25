/* Crie uma classe Aluno com nome e uma lista mutável de notas, com métodos para adicionar nota, calcular média e informar se está aprovado (média maior ou igual a 6). 
Crie uma classe Turma que guarda vários alunos e oferece: adicionar aluno, média geral, lista de aprovados e o aluno com melhor média. Use um companion object em Aluno 
para guardar a constante MEDIA_APROVACAO. */
    
class Aluno(
    val nome: String
) {
    val notas = mutableListOf<Double>()

    fun adicionarNota(nota: Double) {
        notas.add(nota)
    }

    fun calcularMedia(): Double {
        if (notas.isEmpty()) return 0.0
        return notas.average()
    }

    fun estaAprovado(): Boolean {
        return calcularMedia() >= MEDIA_APROVACAO
    }

    companion object {
        const val MEDIA_APROVACAO = 6.0
    }
}

class Turma {
    private val alunos = mutableListOf<Aluno>()

    fun adicionarAluno(aluno: Aluno) {
        alunos.add(aluno)
    }

    fun mediaGeral(): Double {
        if (alunos.isEmpty()) return 0.0
        return alunos.map { it.calcularMedia() }.average()
    }

    fun listaDeAprovados(): List<Aluno> {
        return alunos.filter { it.estaAprovado() }
    }

    fun alunoComMelhorMedia(): Aluno? {
        return alunos.maxByOrNull { it.calcularMedia() }
    }
}

fun main() {
    val aluno1 = Aluno("João")
    aluno1.adicionarNota(7.0)
    aluno1.adicionarNota(8.0)

    val aluno2 = Aluno("Maria")
    aluno2.adicionarNota(5.0)
    aluno2.adicionarNota(4.0)

    val turma = Turma()

    turma.adicionarAluno(aluno1)
    turma.adicionarAluno(aluno2)

    println("Média do João: ${aluno1.calcularMedia()}")
    println("João aprovado? ${aluno1.estaAprovado()}")

    println("Média geral: ${turma.mediaGeral()}")

    println("Aprovados:")
    turma.listaDeAprovados().forEach {
        println(it.nome)
    }

    println("Aluno com melhor média: ${turma.alunoComMelhorMedia()?.nome}")
}