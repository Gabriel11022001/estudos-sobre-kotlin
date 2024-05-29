package pacoteexemplo

class Pessoa(
    var nomeCompleto: String,
    var idade: Int
) {

    fun apresentarPessoa() {
        println("Nome completo: " + this.nomeCompleto)
        println("Idade: " + this.idade)
    }

}