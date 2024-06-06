package colecoes

open class Pessoa(var nome: String, var idade: Int) {

    open fun apresentar() {
        println(this.nome)
        println(this.idade)
    }

}