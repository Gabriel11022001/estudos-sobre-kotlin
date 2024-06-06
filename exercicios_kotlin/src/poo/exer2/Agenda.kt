package poo.exer2

class Agenda {

    private var contatos: ArrayList<Contato>

    constructor() {
        this.contatos = ArrayList()
    }

    fun adicionarContato(contato: Contato): Boolean {

        if (this.validarContatoJaExiste(contato)) {
            println("A agenda já possui esse contato!")

            return false
        } else {
            this.contatos.add(contato)
            println("Contato adicionado com sucesso!")

            return true
        }

    }

    private fun validarContatoJaExiste(contato: Contato): Boolean {
        var contatoJaExiste: Boolean = false

        for (cont in this.contatos) {

            if (cont.contato.trim().equals(contato.contato.trim())) {
                contatoJaExiste = true
            }

        }

        return contatoJaExiste
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

    fun obterUltimoContato(): Contato {

       return this.contatos.last()
    }

    fun obterQuantidadeContatos(): Int {

        return this.contatos.size
    }

}