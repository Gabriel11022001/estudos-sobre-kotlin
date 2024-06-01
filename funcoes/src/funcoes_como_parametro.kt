fun main() {
    println(realizarOperacao(12, 1, ::somar))
    println(realizarOperacao(12, 11, ::subtrair))
    val operacao: Operacao = Operacao()
    println(realizarOperacao(12, 12, operacao::somar))
}

fun somar(primeiroValor: Int, segundoValor: Int): Int {

    return primeiroValor + segundoValor
}

fun subtrair(primeiroValor: Int, segundoValor: Int): Int {

    return primeiroValor - segundoValor
}

fun realizarOperacao(primeiroValor: Int, segundoValor: Int, funcao: (Int, Int) -> Int): Int {

    return funcao(primeiroValor, segundoValor)
}

class Operacao {

    fun somar(primeiroValor: Int, segundoValor: Int): Int {

        return primeiroValor + segundoValor
    }
}