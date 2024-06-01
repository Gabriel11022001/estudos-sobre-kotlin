fun main() {
    println(somar(12.0, 11.8))
    println(somar())
}

/**
 * quando você utilizar parâmetros padrões, você não
 * precisa passar os argumentos quando você invocar
 * a função
 */
fun somar(primeiroValor: Double = 0.0, segundoValor: Double = 0.0): Double {

    return primeiroValor + segundoValor
}