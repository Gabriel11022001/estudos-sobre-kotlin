package classes

class Calculadora(operacao: String) {

    private var operacao: String = ""

    init {
        println("Passado como argumento para o construtor: " + operacao)
        this.operacao = operacao
        println("Operação: ${this.operacao}")
    }

    fun realizarOperacao(primeiroValor: Double, segundoValor: Double): Double {

        if (this.operacao.equals("soma")) {

            return primeiroValor + segundoValor
        }

        return 0.0
    }

}