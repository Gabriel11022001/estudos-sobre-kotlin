package condicionais

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    println("Informe um número:")
    val numero: Int = scanner.nextInt()

    if (validarNumeroEhPar(numero)) {
        println("O número $numero é par!")
    } else {
        println("O número $numero é impar!")
    }

}

fun validarNumeroEhPar(numero: Int): Boolean {

    if (numero % 2 == 0) {

        return true
    }

    return false
}