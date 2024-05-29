fun main() {
    var nome: String = "Gabriel"
    var sobrenome: String = "Rodrigues"
    var nomeCompleto: String = nome + " " + sobrenome
    println("Nome completo: " + nomeCompleto)
    val pessoas = listOf("Gabriel", "Pedro", "Maria");
    println("A primeira pessoa é ${pessoas[0]}")

    for (pessoa in pessoas) {
        println(pessoa)
    }

    // remover espaços do início e do fim
    println(nomeCompleto.trim())
    // obter a string toda em maiusculo
    println(nomeCompleto.uppercase())
    // obter a string toda em minusculo
    println(nomeCompleto.lowercase())
    // obter quantidade de caracteres da string
    println(nomeCompleto.length)
    // validar se a string está vazia ou não
    println(nomeCompleto.isEmpty())
    var stringVazia: String = ""
    println(stringVazia.isEmpty())
}