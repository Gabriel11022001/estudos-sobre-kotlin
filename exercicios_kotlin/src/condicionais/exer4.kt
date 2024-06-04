package condicionais

import java.util.Scanner

fun main() {
    var c: Double = 0.0
    val scanner: Scanner = Scanner(System.`in`)
    println("Informe o valor de A:")
    val a: Double = scanner.nextDouble()
    println("Informe o valor de B:")
    val b: Double = scanner.nextDouble()

    if (a == b) {
        c = a + b
    } else {
        c = a * b
    }

    println("A: $a")
    println("B: $b")
    println("C: $c")
}