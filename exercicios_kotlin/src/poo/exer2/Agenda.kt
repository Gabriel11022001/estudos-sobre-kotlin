package poo.exer2

class Agenda {

    private var contatos: List<Contato>

    constructor() {
        this.contatos = listOf()
    }

    fun adicionarContato(contato: Contato): Boolean {

        if (this.validarContatoJaExiste(contato)) {
            println("A agenda já possui esse contato!")

            return false
        } else {
            this.contatos.plus(contato)
            println("Contato adicionado com sucesso!")

            return true
        }

    }

    private fun validarContatoJaExiste(contato: Contato) {

    }

    fun apresentarContatosAgenda() {

        if (this.contatos.size == 0) {
            println("A agenda não possui contatos!")

            return
        }

        this.contatos.forEach { it ->
            println("id: ${it.id}")
            println("contato: ${it.contato}")
        }
    }

    fun removerContato(id: Int) {

    }

}