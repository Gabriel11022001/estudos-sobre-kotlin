package poo.exer1

import java.util.Scanner

fun main() {

    try {
        var produtos: List<Produto> = registrarProdutos()
        val scanner: Scanner = Scanner(System.`in`)
        val cliente: Cliente = Cliente()
        val pedido: Pedido = Pedido()
        var opcaoSelecionada: Int = 0

        while (cliente.nome.trim().equals("")) {
            println("Informe o seu nome:")
            cliente.nome = scanner.nextLine()

            if (cliente.nome.trim().equals("")) {
                println("O nome é obrigatório!")
            }

        }

        while (cliente.cpf.trim().equals("")) {
            println("Informe seu cpf:")
            cliente.cpf = scanner.nextLine()

            if (cliente.cpf.trim().equals("")) {
                println("O cpf é um dado obrigatório!")
            }

        }

        pedido.cliente = cliente

        while (opcaoSelecionada < 1 || opcaoSelecionada > 4) {
            menu()
            println("Selecione uma opção:")
            opcaoSelecionada = scanner.nextInt()

            if (opcaoSelecionada == 1) {
                apresentarProdutos(produtos)
                var idProduto: Int = 0

                while (!validarExisteProduto(idProduto, produtos)) {
                    println("Informe o id do produto:")
                    idProduto = scanner.nextInt()

                    if (!validarExisteProduto(idProduto, produtos)) {
                        println("Não existe um produto cadastrado com esse id!")
                    } else {
                        var produto: Produto = obterCopiaProdutoPeloId(idProduto, produtos)
                        var quantidadeUnidadesComprar: Int = 0
                        var quantidadeUnidadesValidas: Boolean = false

                        while (!quantidadeUnidadesValidas) {
                            println("Você deseja comprar quantas unidades?")
                            quantidadeUnidadesComprar = scanner.nextInt()

                            if (quantidadeUnidadesComprar <= 0) {
                                quantidadeUnidadesValidas = false
                            } else {
                                quantidadeUnidadesValidas = pedido.validarQuantidadeUnidadesEstoque(idProduto, quantidadeUnidadesComprar, produto)
                            }

                            if (!quantidadeUnidadesValidas) {
                                println("Quantidade de unidades inválida!")
                            }

                        }

                        // adicionar o produto no carrinho de compras
                        decrementarUnidadesDisponiveis(produtos, idProduto, quantidadeUnidadesComprar)
                        pedido.adicionarProdutoCarrinho(
                            produto = produto,
                            quantidadeUnidades = quantidadeUnidadesComprar
                        )
                    }

                }

            } else if (opcaoSelecionada == 2) {

            } else if (opcaoSelecionada == 3) {

            } else if (opcaoSelecionada == 4) {
                println("Finalizado...")
            } else {
                println("Opção inválida!")
            }

            if (opcaoSelecionada == 1 || opcaoSelecionada == 2 || opcaoSelecionada == 3) {
                var continuar: Int = 0

                while (continuar != 1 && continuar != 2) {
                    println("Deseja continuar?")
                    println("Digite 1 para Sim ou 2 para Não!")
                    continuar = scanner.nextInt()

                    if (continuar != 1 && continuar != 2) {
                        println("Opção inválida! Digite 1 para Sim ou 2 para Não!")
                    } else if (continuar == 2) {
                        println("Agradecemos sua interação!")
                        println("Finalizado...")
                    } else {
                        opcaoSelecionada = 0
                    }

                }

            }

        }

    } catch (e: Exception) {
        println(e.message)
    }

}

fun menu() {
    println("================ Menu ==================")
    println("1 - adicionar produto no carrinho")
    println("2 - detalhes do carrinho")
    println("3 - detalhes da venda como um todo")
    println("4 - finalizar")
}

fun registrarProdutos(): List<Produto> {
    val produtos: List<Produto> = listOf(
        Produto(id = 1, nome = "Coca-Cola de 2 litros", preco = 12.98, estoque = 200),
        Produto(id = 2, nome = "Fanta Uva de 2 litros", preco = 12.00, estoque = 10000),
        Produto(id = 3, nome = "Suco Tampico de Laranja", preco = 8.90, estoque = 200),
        Produto(id = 4, nome = "Bolhaca recheada de chocolate", preco = 2.69, estoque = 23000)
    )

    return produtos
}

fun apresentarProdutos(produtos: List<Produto>) {
    println("=============== Produtos ===============")
    produtos.forEach { it ->
        println("id: ${it.id}")
        println("produto: ${it.nome}")
        println("preço: R$${it.preco}")
        println("unidades em estoque: ${it.estoque}")
    }
}

fun validarExisteProduto(id: Int, produtos: List<Produto>): Boolean {
    var existe: Boolean = false

    for (prod in produtos) {

        if (prod.id == id) {
            existe = true
        }

    }

    return existe
}

fun obterCopiaProdutoPeloId(id: Int, produtos: List<Produto>): Produto {
    var produtoEncontrar: Produto? = null

    for (produto in produtos) {

        if (produto.id == id) {
            produtoEncontrar = produto
        }

    }

    if (produtoEncontrar != null) {

        return produtoEncontrar.copy()
    }

    throw RuntimeException("Não existe um produto cadastrado com esse id!")
}

fun decrementarUnidadesDisponiveis(produtos: List<Produto>, idProduto: Int, quantidadeUnidadesDecrementar: Int) {
    var produtosCopia: List<Produto> = arrayListOf()

    for (prod in produtos) {
        var novoProduto: Produto = prod.copy()

        if (novoProduto.id == idProduto) {

            if (novoProduto.estoque - quantidadeUnidadesDecrementar < 0) {
                novoProduto.estoque = 0
            } else {
                novoProduto.estoque -= quantidadeUnidadesDecrementar
            }

        }

        produtosCopia.plus(novoProduto)
    }

    // produtos = produtosCopia
}