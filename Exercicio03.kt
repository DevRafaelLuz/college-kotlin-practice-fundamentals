fun main() {
    val temperaturas = arrayOf(21.0, 18.1, 10.5, 14.9, 8.7, 2.9, 30.0)
    var temperaturaMaisAlta: Double = temperaturas[1]
    var temperaturaMaisBaixa: Double = temperaturas[1]
    var somaTotalDasTemperaturas: Double = 0.0
    
    // Exibição com for
    for (temperatura in temperaturas) {
        if (temperatura > temperaturaMaisAlta) {
            temperaturaMaisAlta = temperatura
        }
        if (temperatura < temperaturaMaisBaixa) {
            temperaturaMaisBaixa = temperatura
        }
        somaTotalDasTemperaturas += temperatura
    }
    println("Maior Temperatura: $temperaturaMaisAlta")
    println("Menor Temperatura: $temperaturaMaisBaixa")
    println("Temperatura Média: ${somaTotalDasTemperaturas / 7}")
    
    // Exibição com funções prontas
    println("Maior Temperatura: ${temperaturas.maxOrNull()}")
    println("Menor Temperatura: ${temperaturas.minOrNull()}")
    println("Temperatura Média: ${temperaturas.average()}")
}