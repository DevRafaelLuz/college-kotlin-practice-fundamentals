/* Crie uma data class Produto(val nome: String, val preco: Double) e uma lista com pelo menos cinco produtos. Usando apenas funções de ordem superior (sem for), 
produza: a lista dos produtos acima de 100 reais, a lista só com os nomes, o preço total, o produto mais caro e a lista ordenada por preço. */
    
data class Produto(val nome: String, val preco: Double)

fun main() {
    val produtos = listOf(
        Produto("Notebook", 3500.0),
        Produto("Mouse", 80.0),
        Produto("Teclado", 150.0),
        Produto("Monitor", 900.0),
        Produto("Fone de ouvido", 120.0),
        Produto("Webcam", 250.0)
    )

    // Produtos acima de R$ 100
    val acimaDe100 = produtos.filter { it.preco > 100 }

    // Lista somente com os nomes
    val nomes = produtos.map { it.nome }

    // Preço total
    val precoTotal = produtos.sumOf { it.preco }

    // Produto mais caro
    val produtoMaisCaro = produtos.maxByOrNull { it.preco }

    // Lista ordenada por preço
    val ordenadosPorPreco = produtos.sortedBy { it.preco }

    println("Produtos acima de R$ 100: $acimaDe100")
    println("Nomes: $nomes")
    println("Preço total: R$ $precoTotal")
    println("Produto mais caro: $produtoMaisCaro")
    println("Produtos ordenados por preço: $ordenadosPorPreco")
}