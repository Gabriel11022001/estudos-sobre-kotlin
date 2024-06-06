package colecoes

class Produto(var nome: String, var preco: Double, var unidadesEstoque: Int) {

    fun apresentarDadosProduto() {
        println("nome do produto: ${ this.nome }")
        println("preço: R$${ this.preco }")
        println("unidades em estoque: ${ this.unidadesEstoque }")
    }

}