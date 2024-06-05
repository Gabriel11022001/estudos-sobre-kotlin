package classes

class SegundaCalculadora {

    companion object {

        @JvmStatic var quantidadeOperacoesRealizou: Int = 0

        fun somar(primeiroValor: Int, segundoValor: Int): Int {
            quantidadeOperacoesRealizou++

            return primeiroValor + segundoValor
        }

    }

}