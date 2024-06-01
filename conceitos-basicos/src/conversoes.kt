fun main() {
    var texto: String = "1"
    var numero: Int = 22
    // converter um número para string
    println(numero.toString())
    // converter uma string para um número
    println(texto.toInt())
    println(texto.toDouble())

    // checagem de tipo
    var nome: String = "Gabriel Rodrigues dos Santos"

    if (nome is String) {
        println("é uma string")
    } else {
        println("não é uma string")
    }

    smartCast("Gabriel")
    smartCast(12)
    var numeroInteiro: Int = 11
    var numeroDouble = numeroInteiro as? Double
    println(numeroDouble)
}

fun smartCast(variavel: Any) {

    if (variavel is String) {
        println(variavel.uppercase())
    } else if (variavel is Int) {
        // o método plus() incrementa um valor ao valor da variável do tipo inteiro
        println(variavel.plus(3))
    } else if (variavel is Boolean) {
        println("é um booleano!")
    } else {
        println("Nenhum dos tipos testados!")
    }

}