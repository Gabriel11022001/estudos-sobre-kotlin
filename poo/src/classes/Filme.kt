package classes

class Filme {

    val nome: String
    val genero: String

    /**
     * posso definir um construtor dessa forma, mas o correto mesmo
     * é definir o construtor como class Filme(val nome: String, val genero: String)
     * e caso eu queira processar algo na instanciação do objeto, eu utilizo o bloco
     * init
     */
    constructor(nome: String, genero: String) {
        this.nome = nome
        this.genero = genero
    }

}