fun main() {
    // comentário de unica linha
    /**
     * comentário de multiplas linhas
     */
    // no exemplo abaixo, a função print() não será invocada pois foi adicionado um comentário
    // print("Teste")
    println("Soma: " + somar(12.0, 9.0))
}

/**
 * Função que realiza a soma entre dois valores do tipo Double
 * @param primeiroValor primeiro valor passado para a soma
 * @param segundoValor segundo valor passado para a soma
 * @return retorno da soma entre o primeiro valor e o segundo valor
 */
fun somar(primeiroValor: Double, segundoValor: Double): Double {

    return primeiroValor + segundoValor
}