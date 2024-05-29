package basico

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    println("Informe a sua idade:")
    val idade: Int = scanner.nextInt()
    println("Informe seu nome:")
    val nome: String = scanner.next()
    val quantidadeDiasViveu: Int = idade * 365
    println("Seu nome é ${nome.uppercase()} e você viveu ${quantidadeDiasViveu} dias!")
}