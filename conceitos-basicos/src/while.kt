import java.util.Scanner

fun main() {
    var contador: Int = 0

    while(contador <= 100) {
        println(contador)
        contador++
    }

    var digitouMenosUm: Boolean = false
    val scanner: Scanner = Scanner(System.`in`)

    while (!digitouMenosUm) {
        println("Digite -1 para parar ou qualquer outro número para continuar:")
        val numero: Int = scanner.nextInt();

        if (numero == -1) {
            digitouMenosUm = true
        }

    }

    val pessoas = listOf("Gabriel", "Pedro", "Eduardo", "Fernanda", "Gustavo")
    var indice: Int = 0

    while (indice < pessoas.count()) {
        println("Pessoa: ${pessoas[indice]}")
        indice += 1
    }

}