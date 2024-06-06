package lambdas


fun main() {

    val soma = { primeiroValor: Int, segundoValor: Int -> Int // tipo de retorno
        // o que estiver na última linha será o retorno da lambda
        primeiroValor + segundoValor
    }

    val subtracao = { primeiroValor: Int, segundoValor: Int -> // sem definir o tipo de retorno
        primeiroValor - segundoValor
        "Meu nome é Gabriel Rodrigues dos Santos" // retorno pois está na ultima linha
    }

    println(soma(11, 11))
    println(subtracao(11, 2))
}