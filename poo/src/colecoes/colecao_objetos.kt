package colecoes

fun main() {
    var produtos = arrayListOf(
        Produto("Banana", 12.9, 100),
        Produto("Coca-Cola de 2 litros", 12.09, 200)
    )

    for (produto in produtos) {
        produto.apresentarDadosProduto()
    }

    // com o ArrayList eu posso adicionar elementos
    produtos.add(Produto("Fanta Uva", 12.88, 100))
    produtos.add(Produto("Carne moida", 21.87, 1000))

    produtos.forEach { it -> it.apresentarDadosProduto() }

    if (produtos.isEmpty()) {
        println("A lista de produtos está vazia!")
    } else {
        println("A lista de produtos possui " + produtos.size + " produtos!")
    }

    val pessoas: ArrayList<Pessoa> = ArrayList()
    val pessoa1: Cliente = Cliente("Gabriel", 23, "teste@gmail.com", "login@teste", "grs222222")
    // pessoa1.apresentar()
    val pessoa2: Cliente = Cliente("Pedro", 23, "testepedro@gmail.com", "pedro@teste", "pedro@testefff")
    val pessoa3: Funcionario = Funcionario("Gustavo", 28, 3400.98, 2)
    val pessoa4: Pessoa = Funcionario("Eduardo", 66, 5600.00, 1)
    pessoas.add(pessoa1)
    pessoas.add(pessoa2)
    pessoas.add(pessoa3)
    pessoas.add(pessoa4)
    pessoas.forEach { it -> it.apresentar() }
}