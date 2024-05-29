package segundopacotexemplo

class Pessoa(var nomeCompleto: String, var sexo: String, var idade: Int) {

    fun apresentar() {
        println("Nome: " + this.nomeCompleto)
        println("Idade: " + this.idade)
        println("Sexo: " + this.sexo)
    }

}