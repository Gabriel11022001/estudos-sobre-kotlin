package poo.exer1

import java.util.Scanner

fun main() {

    try {
        val produtos: List<Produto> = registrarProdutos()
        val scanner: Scanner = Scanner(System.`in`)
        val cliente: Cliente = Cliente()

        while (cliente.nome.trim().equals("")) {
            println("Informe o seu nome:")
            cliente.nome = scanner.nextLine()

            if (cliente.nome.trim().equals("")) {
                println("O nome é obrigatório!")
            }

        }

        println(cliente.toString())
    } catch (e: Exception) {
        println(e.message)
    }

}

fun registrarProdutos(): List<Produto> {
    val produtos: List<Produto> = listOf(
        Produto(nome = "Coca-Cola de 2 litros", preco = 12.98, estoque = 200),
        Produto(nome = "Fanta Uva de 2 litros", preco = 12.00, estoque = 10000),
        Produto(nome = "Suco Tampico de Laranja", preco = 8.90, estoque = 200),
        Produto(nome = "Bolhaca recheada de chocolate", preco = 2.69, estoque = 23000)
    )

    return produtos
}