package poo.exer2

import java.util.Scanner

fun main() {

    try {
        val agenda: Agenda = Agenda()
        var scanner: Scanner = Scanner(System.`in`)
        var opcao: Int = 0

        while (opcao < 1 || opcao > 4) {
            menu()
            println("Selecione uma opção:")
            opcao = scanner.nextInt()

            if (opcao == 1) {
                var contatoDescricao: String = ""
                var contatoId: Int = 0

                while (contatoDescricao.trim().equals("")) {
                    println("Informe a descrição do contato:")
                    contatoDescricao = readLine().toString()

                    if (contatoDescricao.trim().equals("")) {
                        println("A descrição do contato é obrigatoria!")
                    }

                }

                if (agenda.obterQuantidadeContatos() == 0) {
                    contatoId = 1
                } else {
                    val ultimoContato: Contato = agenda.obterUltimoContato()
                    contatoId = ultimoContato.id + 1
                }

                val contatoCadastrar: Contato = Contato(id = contatoId, contato = contatoDescricao)

                while (!agenda.adicionarContato(contatoCadastrar)) {
                    println("Informe uma nova descrição para o contato:")
                    contatoCadastrar.contato = readLine().toString()
                }

            } else if (opcao == 2) {
                agenda.apresentarContatosAgenda()
            } else if (opcao == 3) {

            } else if (opcao == 4) {
                println("Finalizando...")
            } else {
                println("Opção inválida!")
            }

            if (opcao >= 1 && opcao <= 3) {
                var continuar: Int = 0

                while (continuar != 1 && continuar != 2) {
                    println("Deseja continuar?")
                    println("Digite 1 para SIM ou 2 para NÃO")
                    continuar = scanner.nextInt()

                    if (continuar != 1 && continuar != 2) {
                        println("Opção inválida!")
                    } else if (continuar == 1) {
                        opcao = 0
                    } else {
                        println("Finalizando...")
                    }

                }

            }

        }

    } catch (e: Exception) {
        println(e.message)
    }

}

fun menu() {
    println("===================== Menu ======================")
    println("1 - adicionar contato na agenda")
    println("2 - apresentar agenda")
    println("3 - remover contato da agenda")
    println("4 - finalizar programa")
}