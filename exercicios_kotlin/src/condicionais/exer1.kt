package condicionais

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    var primeiroNumero: Int = 0
    var segundoNumero: Int = 0
    var terceiroNumero: Int = 0
    var soma: Int = 0
    println("Informe o primeiro valor:")
    primeiroNumero = scanner.nextInt()
    println("Informe o segundo número:")
    segundoNumero = scanner.nextInt()
    println("Informe o terceiro número:")
    terceiroNumero = scanner.nextInt()
    soma = primeiroNumero + segundoNumero

    if (soma > terceiroNumero) {
        println("A soma $soma é maior que o terceiro número que é igual a $terceiroNumero")
    } else {
        println("A soma ${soma} não é maior que o terceiro número que é igual a ${terceiroNumero}")
    }

}