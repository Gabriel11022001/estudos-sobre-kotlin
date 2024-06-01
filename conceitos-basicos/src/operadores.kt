fun main() {
    // aritméticos
    val primeiroValor: Double = 100.0
    val segundoValor: Double = 200.0
    // soma
    val soma: Double = primeiroValor + segundoValor
    // subtração
    val sub: Double = primeiroValor - segundoValor
    // multiplicação
    val mult: Double = primeiroValor * segundoValor
    // divisão
    val divisao: Double = primeiroValor / segundoValor
    println("Soma: ${soma}")
    println("Subtração: ${sub}")
    println("Multiplicação: ${mult}")
    println("Divisão: ${divisao}")

    // operadores de atribuição
    var numero: Int = 1
    // incremento
    numero++
    println(numero)
    numero += 1
    println(numero)
    numero += 10
    println(numero)
    // decremento
    numero--
    println(numero)
    numero -= 2
    println(numero)
    // multiplicação
    numero *= 2
    println(numero)
    // divisão
    numero /= 2
    println(numero)

    // relacionais
    val num1: Int = 2
    val num2: Int = 3
    // maior que
    println(num1 > num2)
    // menor que
    println(num1 < num2)
    // maior ou igual a
    println(num1 >= num2)
    // menor ou igual a
    println(num1 <= num2)
    // igual a
    println(num1 == num2)
    // diferente de
    println(num1 != num2)

    // lógicos
    val possuiCnh: Boolean = true
    val estaVencida: Boolean = true
    val estaAcompanhadoPessoaPossuiCnh: Boolean = false

    if ((possuiCnh && !estaVencida) || estaAcompanhadoPessoaPossuiCnh) {
        println("Pode viajar normalmente com o carro!")
    } else {
        println("Não pode viajar com o carro!")
    }

}