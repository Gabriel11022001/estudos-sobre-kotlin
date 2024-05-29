package basico

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    println("Informe a largura do terreno:")
    val largura: Double = scanner.nextDouble()
    println("Informe o comprimeiro do terreno:")
    val comprimento: Double = scanner.nextDouble()
    val area: Double = calcularAreaTerreno(comprimento, largura)
    println("A área do terreno é igual a ${area}m2")
}

fun calcularAreaTerreno(comprimento: Double,  largura: Double): Double {

    return comprimento * largura
}