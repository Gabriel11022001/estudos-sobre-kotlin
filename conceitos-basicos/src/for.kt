fun main() {

    // percorrer de 0 até 100
    for (contador in 0..100) {
        println(contador)
    }

    val pessoas = listOf("Gabriel", "Pedro", "Eduardo", "Mateus");

    // percorrendo a lista
    for (pessoa in pessoas) {
        println(pessoa)
    }

    // percorrendo de 100 até 0
    for (contador in 100 downTo 0) {
        println(contador)
    }

}