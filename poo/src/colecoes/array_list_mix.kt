package colecoes

fun main() {
    val listaMix = arrayListOf(12, "Gabriel", "Pedro", false, true, 22.9, 454.87f)

    for (item in listaMix) {
        println(item)

        if (item is String) {
            println("é uma string")
        } else if (item is Double) {
            println("é um double")
        } else if (item is Int) {
            println("é um inteiro")
        } else if (item is Boolean) {
            println("é um boolean")
        }

    }

}