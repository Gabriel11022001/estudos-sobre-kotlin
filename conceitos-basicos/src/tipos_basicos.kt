fun main() {
    // inteiro
    var idade: Int = 22
    // string
    var nomeCompleto: String = "Gabriel Rodrigues dos Santos"
    // boolean
    var possuiCnh: Boolean = true
    // double
    var peso: Double = 22.0
    // float
    var altura: Float = 1.83f
    apresentarDados(
        idade,
        nomeCompleto,
        possuiCnh,
        peso,
        altura
    )
    // posso somar dados de tipos numéricos diferentes
    val primeiroValor: Int = 22
    val segundoValor: Double = 11.0
    println(primeiroValor + segundoValor) // somei um int com um double
}

fun apresentarDados(idade: Int, nome: String, possuiCnh: Boolean, peso: Double, altura: Float) {
    println("Nome: " + nome)
    println("Idade: " + idade)

    if (possuiCnh) {
        println("Possui cnh")
    } else {
        println("Não possui cnh")
    }

    println("Peso: " + peso + "kg")
    println("Altura: " + altura + "m")
}