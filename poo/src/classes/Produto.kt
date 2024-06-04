package classes

class Produto {

    var nome: String
        // método get
        get() {
            println("Invocou o get() da propriedade nome!")

            return field
        }
        // método set
        set(nome: String) {
            println("Invocou o set() da propriedade nome!")

            if (nome.isEmpty()) {
                field = "Informou nome vazio!"
            } else {
                field = nome
            }

        }

    constructor(nome: String) {
        // quando eu atribuir um valor a propriedade será invocado o método set()
        this.nome = nome
    }

}