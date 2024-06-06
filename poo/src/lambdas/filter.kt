package lambdas

fun main() {
    val alunos = listOf(
        Aluno("Gabriel", 9.0),
        Aluno("Pedro", 8.2),
        Aluno("Gustavo", 6.5),
        Aluno("José", 5.2),
        Aluno("Eduarda", 2.9),
        Aluno("Fernanda", 9.8)
    )
    val alunosAprovados = alunos.filter { it ->
        it.nota >= 7 // critério para filtrar
    }
    println(alunosAprovados)
    val reprovados = alunos.filter { it ->
        it.nota < 7
    }
    println(reprovados)
}