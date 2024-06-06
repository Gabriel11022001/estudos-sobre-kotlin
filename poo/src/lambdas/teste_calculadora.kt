package lambdas

fun main() {
    val calculadora: Calculadora = Calculadora()

    val soma: Double = calculadora.calcular(10.1, 100.9) { primeiroValor: Double,  segundoValor: Double -> Double
        primeiroValor + segundoValor
    }

    println("Soma: " + soma)

    val subtracao: Double = calculadora.calcular(12.9, 11.7) { primeiroNumero: Double, segundoNumero: Double -> Double
        primeiroNumero - segundoNumero
    }

    println("Subtração: " + subtracao)
}
