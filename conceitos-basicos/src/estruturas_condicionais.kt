import java.util.Scanner

fun main() {
    val idade: Int = 23

    if (idade >= 18) {
        println("é maior de idade!")
    }

    val scanner: Scanner = Scanner(System.`in`)
    var primeiraNota: Double = 0.0
    var segundaNota: Double = 0.0
    var media: Double = 0.0
    println("Informe a primeira nota:")
    primeiraNota = scanner.nextDouble()
    println("Informe a segunda nota:")
    segundaNota = scanner.nextDouble()
    media = calcularMedia(primeiraNota, segundaNota)
    println("Média: ${media}")

    if (media >= 7) {
        println("Aprovado!")
    } else {
        println("Reprovado!")
    }

    if (media >= 7) {
        println("Você foi aprovado!")
    } else if (media >= 5) {
        println("Você está de recuperação!")
    } else {
        println("Você foi reprovado!")
    }

    var possuiCnh: Boolean = true
    var podeDirigir: String = if (possuiCnh) {
        "Sim"
    } else {
        "Não"
    }

    println("Pode dirigir? " + podeDirigir)
}

fun calcularMedia(primeiraNota: Double, segundaNota: Double): Double {

    return (primeiraNota + segundaNota) / 2
}