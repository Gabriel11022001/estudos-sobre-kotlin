fun main() {

    for (numero in ordenarNumeros(1, 2, 33, 22, 11, 12)) {
        println(numero)
    }

}

// o parâmetro "numeros" será um array contendo os dados passados como argumento para a função
fun ordenarNumeros(vararg numeros: Int): IntArray {

    return numeros.sortedArray()
}