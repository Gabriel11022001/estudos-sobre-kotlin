import java.util.Scanner

fun main() {
    // invocando a função
    println(somar(12, 100))
    println(somar(100, 100))
    apresentarMensagem("")
    apresentarMensagem("Olá, meu nome é Gabriel Rodrigues dos Santos")
    val console: Scanner = Scanner(System.`in`)
    println("Informe o primeiro valor:")
    val primeiroNumeroSomar: Int = console.nextInt() // exemplo de método, que é uma função mas que está implementado em uma classe
    println("Informe o segundo valor:")
    val segundoNumeroSomar: Int = console.nextInt()
    val soma: Int = somar(primeiroNumeroSomar, segundoNumeroSomar)
    println("A soma entre ${primeiroNumeroSomar} e ${segundoNumeroSomar} é igual a ${soma}")
}

/**
 * no exemplo abaixo, essa função recebe dois parâmetros do tipo int,
 * e retorna um dado do tipo int, quando uma função retorna um valor,
 * eu preciso definir o tipo de retorno da função
 */
fun somar(primeiroValor: Int, segundoValor: Int): Int {

    return primeiroValor + segundoValor
}

// função que não possui retorno, não preciso definir o tipo de retorno, que seria void
fun apresentarMensagem(mensagem: String) {

    if (mensagem.trim().length == 0) {
        println("Informe a mensagem!")
    } else {
        println(mensagem)
    }

}