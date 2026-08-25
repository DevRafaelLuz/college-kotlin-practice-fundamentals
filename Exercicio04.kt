fun main() {
    print("Digite seu nome: ")
    val nome = readln()

    print("Digite a letra que deseja procurar: ")
    val letra = readln().first()

    var contador = 0

    for (caractere in nome) {
        if (caractere.lowercaseChar() == letra.lowercaseChar()) {
            contador++
        }
    }

    println("A letra '$letra' aparece $contador vezes no nome.")
    
    // Usando count {}
    contador = 0
    contador = nome.count { it.lowercaseChar() == letra.lowercaseChar() }

    println("A letra '$letra' aparece $contador vezes no nome.")
}