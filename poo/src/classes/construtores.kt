package classes

fun main() {
    val filme1: Filme = Filme(nome = "Filme de teste 1", genero = "Terror")
    println(filme1.nome)
    println(filme1.genero)
    val filme2: Filme2 = Filme2("Filme de teste 2", "Comédia")
    println(filme2.nome)
    println(filme2.genero)
}