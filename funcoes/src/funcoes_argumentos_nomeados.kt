fun main() {
    apresentarRelacaoTrabalho("Gabriel", "Maria")
    apresentarRelacaoTrabalho(chefe = "Pedro", funcionario = "Eduardo")
    apresentarRelacaoTrabalho(funcionario = "Gustavo", chefe = "Eduardo")
}

fun apresentarRelacaoTrabalho(chefe: String, funcionario: String) {
    println("$funcionario é subordinado de $chefe")
}