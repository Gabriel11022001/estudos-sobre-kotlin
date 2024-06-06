package lambdas

class Calculadora {

    fun calcular(primeiroValor: Double, segundoValor: Double, calcular: (Double, Double) -> Double): Double {

        return calcular(primeiroValor, segundoValor)
    }

}