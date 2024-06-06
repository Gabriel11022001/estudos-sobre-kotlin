package colecoes

class Cliente(
    nome: String,
    idade: Int,
    var email: String,
    var login: String,
    var senha: String
): Pessoa(
    nome,
    idade
) {

    override fun apresentar() {
        super.apresentar()
        println(this.email)
        println(this.login)
        println(this.senha)
    }

}