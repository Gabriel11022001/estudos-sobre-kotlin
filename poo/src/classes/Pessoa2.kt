package classes

import javax.naming.directory.InvalidAttributesException

/**
 * no exemplo abaixo, estou criando a classe
 * definindo o construtor
 * - quando eu for instanciar o objeto, eu vou ser obrigado a passar
 * os argumentos para o construtor
 */
class Pessoa2(
    var nome: String,
    var idade: Int,
    var sexo: String,
) {

    init {
        /**
         * no bloco init eu consigo programar
         * o corpo do método construtor
         */
        println("Executando o construtor da classe Pessoa2")
        this.nome = nome.uppercase()

        if (idade <= 0) {
            throw InvalidAttributesException("Idade inválida!")
        }

    }

    fun apresentarDadosPessoa() {
        println("Nome: ${this.nome}")
        println("Idade: ${this.idade}")
        println("Sexo: ${this.sexo.uppercase()}")
    }

}