package condicionais

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    var nome: String = ""
    var estadoCivil: String = ""
    var sexo: String = ""
    var quantidadeAnosCadada: Int = 0

    while (nome == "") {
        println("Informe seu nome:")
        nome = scanner.next()

        if (nome == "") {
            println("Nome inválido!")
        }

    }

    while (sexo == "" || (sexo.lowercase() != "masculino" && sexo.lowercase() != "feminino")) {
        println("Informe seu sexo:")
        println("Informe masculino ou feminino!")
        sexo = scanner.next()

        if (sexo == "") {
            println("O sexo é obrigatório!")
        } else {

            if (!sexo.lowercase().equals("masculino") && !sexo.lowercase().equals("feminino")) {
                println("Sexo inválido!")
            }

        }

    }

    while (estadoCivil == "" || (!estadoCivil.lowercase().equals("casado") && !estadoCivil.lowercase().equals("solteiro"))) {
        println("Informe seu estado civil: informe casado ou solteiro")
        estadoCivil = scanner.next()

        if (estadoCivil == "") {
            println("Informe seu estado civil!")
        } else {

            if (!estadoCivil.lowercase().equals("casado") && !estadoCivil.lowercase().equals("solteiro")) {
                println("Estado civil inválido!")
            }

        }

    }

    if (estadoCivil.equals("casado") && sexo.equals("feminino")) {

        while (quantidadeAnosCadada <= 0 || quantidadeAnosCadada > 90) {
            println("Informe quantos anos você está casada:")
            quantidadeAnosCadada = scanner.nextInt()

            if (quantidadeAnosCadada <= 0 || quantidadeAnosCadada > 90) {
                println("Tempo de casada inválido!")
            }

        }

    }

    println("Nome: $nome")
    println("Sexo: $sexo")
    println("Estado civil: $estadoCivil")

    if (quantidadeAnosCadada > 0) {
        println("Anos de casamento: $quantidadeAnosCadada")
    }

}