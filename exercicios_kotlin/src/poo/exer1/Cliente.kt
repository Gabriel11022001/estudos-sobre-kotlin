package poo.exer1

class Cliente {

    var nome: String
    var cpf: String
    var telefone: String

    constructor() {
        this.nome = ""
        this.telefone = ""
        this.cpf = ""
    }

    override fun toString(): String {

        return "{ nome: ${this.nome} | cpf: ${this.cpf} }"
    }

}