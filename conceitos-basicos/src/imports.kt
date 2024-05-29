import pacoteexemplo.Pessoa as Pessoa1
import segundopacotexemplo.Pessoa as Pessoa2
// importando todas as classes de um pacote
import pacotepossuivariasclasses.*

fun main() {
    var pessoa1: Pessoa1 = Pessoa1("Gabriel", 23)
    var pessoa2: Pessoa2 = Pessoa2("Gabriel", "Masculino", 23)
    pessoa1.apresentarPessoa()
    pessoa2.apresentar()
    val cliente: Cliente = Cliente()
    val produto: Produto = Produto()
    val categoriaProduto: Categoria = Categoria()
}