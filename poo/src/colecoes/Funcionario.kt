package colecoes

class Funcionario(
    nome: String,
    idade: Int,
    var salario: Double,
    var tempoCasaEmAnos: Int
): Pessoa(
    nome,
    idade
) {

    override fun apresentar() {
        super.apresentar()
        println(this.salario)
        println(this.tempoCasaEmAnos)
    }

}