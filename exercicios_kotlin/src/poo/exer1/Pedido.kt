package poo.exer1

class Pedido {

    val carrinho: List<Item>
    var cliente: Cliente
        set(cliente: Cliente) {

            if (cliente == null) {
                throw RuntimeException("Informe o cliente da venda!")
            }

            field = cliente
        }
    private var valorTotal: Double

    constructor() {
        this.carrinho = arrayListOf()
        this.valorTotal = 0.0
        this.cliente = Cliente()
    }

    fun adicionarProdutoCarrinho(produto: Produto, quantidadeUnidades: Int) {

        if (this.carrinho.size == 0) {
            val item: Item = Item(
                produto = produto,
                quantidadeComprar = quantidadeUnidades
            )
            this.carrinho.plus(carrinho)
            println("Item que acabou de ser adicionado: " + this.carrinho.get(0).produto.nome)
        }

    }

    fun detalhesCarrinho() {

    }

    private fun calcularValorTotalVenda() {

    }

    fun detalhesVenda() {

    }

    fun validarQuantidadeUnidadesEstoque(idProduto: Int, quantidadeUnidadesQuerComprar: Int, produto: Produto): Boolean {
        var valido: Boolean = true

        if (this.carrinho.size == 0) {

            if (produto.estoque < quantidadeUnidadesQuerComprar) {
                valido = false
            }

        } else {
            var item: Item? = null

            for (itemCarrinho in this.carrinho) {

                if (itemCarrinho.produto.id == idProduto) {
                    item = itemCarrinho
                }

            }

            if (item == null) {

                if (produto.estoque < quantidadeUnidadesQuerComprar) {
                    valido = false
                }

            } else {
                // o produto já está no carrinho
                val quantidadeUnidadesProdutoAdicionadasCarrinho: Int = item.quantidadeComprar
                val quantidadeAcrescida: Int = quantidadeUnidadesProdutoAdicionadasCarrinho + quantidadeUnidadesQuerComprar

                if (quantidadeAcrescida > produto.estoque) {
                    valido = false
                }

            }

        }

        return valido
    }

}