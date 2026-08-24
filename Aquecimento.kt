fun main() {
    var nome = "Rafael"
    nome = "Outro"   
    
    println(nome)
    
    val idade = 21
    
    println("Tenho $idade anos")
    println("Ano que vem: ${idade + 1}")
    
    println(7 / 2)
    println(7.0 / 2) // Eles se diferem porque um é dado do tipo inteiro e outro do tipo double
    
    if (idade >= 18) {
        println("maior de idade")
    }
    
    val texto = if (idade >= 18) "maior" else "menor"
    println(texto)
    
    for (i in 5 downTo 1 step 2) {
        println(i)
    }
    
    val lista = listOf(1, 2, 3, 4, 5)
    println(lista.sum())
    println(lista.average())
    println(lista.filter { it > 2 })
    
    var email: String? = null
    println(email?.length ?: 0)
}
