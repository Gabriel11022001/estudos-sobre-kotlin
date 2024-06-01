fun main() {

    try {
        println(obterMenorValor(12, 11))
        println(obterMenorValor(11, 11))
    } catch (e: RuntimeException) {
        println(e.message)
    }

}

fun obterMenorValor(primeiroValor: Int, segundoValor: Int): Int {

    if (primeiroValor > segundoValor) {

        return primeiroValor
    } else if (segundoValor > primeiroValor) {

        return segundoValor
    }

    throw RuntimeException("Os valores são iguais!")
}