fun main() {
    var somaTotalNotas: Double = 0.0
    
    for (i in 1..3) {
        do {
            print("Digite a nota $i: ")
            val nota = readLine()?.toDoubleOrNull() ?: -1.0
            
            if (nota in 0.0..10.0) {
                somaTotalNotas += nota
            }            
        } while (nota !in 0.0..10.0)
    }
    
    val media: Double = somaTotalNotas / 3
    
    when {
        media >= 9.0 -> println("A")
        media >= 7.0 -> println("B")
        media >= 5.0 -> println("C")
        else -> println("D")
    }
}