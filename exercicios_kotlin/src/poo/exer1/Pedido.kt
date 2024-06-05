package poo.exer1

class Pedido {

    val carrinho: List<Item>
    private var cliente: Cliente
        set(cliente: Cliente) {

            if (cliente == null) {
                throw RuntimeException("Informe o cliente da venda!")
            }

            field = cliente
        }
    private var valorTotal: Double

    constructor(cliente: Cliente) {
        this.carrinho = ArrayList()
        this.cliente = cliente
        this.valorTotal = 0.0
    }

    fun adicionarProdutoCarrinho(produto: Produto, quantidadeUnidades: Int) {

    }

    fun detalhesCarrinho() {

    }

    private fun calcularValorTotalVenda() {

    }

    fun detalhesVenda() {

    }

}