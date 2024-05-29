fun main() {
    // kotlin é uma linguagem de tipagem forte
    var nome: String = "Gabriel Rodrigues dos Santos"
    println(nome)
    /**
     * no exemplo abaixo, o tipo da variável
     * idade será definido pelo tipo do dado atribuido
     * a mesma
     */
    var idade = 23
    println(idade)
    var primeiroValor: Float = 11.0f
    var segundoValor: Float = 11.8f
    var soma: Float = primeiroValor + segundoValor
    println("A soma entre " + primeiroValor + " e " + segundoValor + " é igual a " + soma)
    // constantes
    val nomeConstante: String = "Pedro José" // -> utilizar a palavra reservada "val"
    println(nomeConstante)
    // nomeConstante = "Eduarda" -> não foi possível alterar o valor da constante
}