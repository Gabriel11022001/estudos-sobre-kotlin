package classes

fun main() {
    // instanciando o objeto
    // não precisa utilizar a palavra reservada new
    val pessoa1: Pessoa = Pessoa()
    // acessando as propriedades
    pessoa1.nome = "Gabriel Rodrigues dos Santos"
    pessoa1.idade = 23
    println("Nome: ${pessoa1.nome}")
    println("Idade: ${pessoa1.idade}")

    try {
        val pessoa2: Pessoa2 = Pessoa2("Gabriel", -1, "masculino")
        pessoa2.apresentarDadosPessoa()
    } catch (e: Exception) {
        println(e.message)
    }

    val data: Data = Data(11, 2, 2020)
    println(data.obterDataFormatada())
    val calculadora: Calculadora = Calculadora("soma")
    println(calculadora.realizarOperacao(11.0, 11.0))
}