package classes

fun main() {
    val cliente: Cliente = Cliente(
        nome = "Gabriel",
        sexo = "Masculino",
        remuneracao = 3500.0
    )

    println(cliente.nome)
    println(cliente.sexo)
    println(cliente.remuneracao)
    // o data class já implementa automaticamente o método toString()
    println(cliente.toString())
    // também implementa um método de nome copy() que retorna uma instancia identica a atual
    val cliente2 = cliente.copy()
    println(cliente2.toString())

    // também implementa o equals()
    if (cliente2.equals(cliente)) {
        println("São iguais!")
    }

    // também posso utilizar o destruting com data class
    var (nome, sexo, remuneracao) = cliente
    println(nome)
}