fun main() {
    // Contagem Regrassiva
    for (i in 10 downTo 1) {
        println(i)
    }
    println("Lançado")
    
    // Tabuada
    print("Informe qual tabuada deseja saber: ")
    val numeroTabuada = readLine()?.toIntOrNull() ?: 1
    
    for (i in 1..10) {
        println("$numeroTabuada x $i = ${i * numeroTabuada}")
    }
    
    // Números Pares
    print("Números pares com step: ")
    for (i in 0..20 step 2) {
        print("$i ")
    }
    
    print("\nNúmeros pares com operador %: ")
    for (i in 0..20) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
    /* No primeiro for foi usado o step, pulando de duas em duas casas para imprimir só os números pares.
    Já no segundo foi feita a divisão por dois, e se o resto for 0, o número é par. */
}