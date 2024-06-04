package condicionais

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    println("Informe um número:")
    val numero: Int = scanner.nextInt()

    if (numero >= 0) {
        println("O dobro do número $numero é igual a ${numero * 2}")
    } else {
        println("O triplo do número $numero é igual a ${numero * 3}")
    }

}