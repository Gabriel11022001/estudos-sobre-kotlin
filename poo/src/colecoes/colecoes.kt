package colecoes

fun main() {
    var numeros = arrayListOf(10, 11, 22, 34)
    numeros.set(0, 10)
    numeros.set(1, 22)
    // numeros.set(4, 344) -> vai estorar exceção pois o array possui tamanho 4

    for (num in numeros) {
        println("número: ${ num }")
    }

    val nomes = arrayListOf("Gabriel", "Eduardo", "Pedro", "Mateus", "Gustavo")

    for (nome in nomes) {
        println("Nome: " + nome.uppercase())
    }

    val idades = intArrayOf(12, 11, 11, 23, 44, 55)

    idades.forEach { it -> println(it) }

}