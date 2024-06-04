package classes

/**
 * as data classes são classes que não possuem métodos, só servem basicamente
 * para armazenar dados
 * - é legal utilizar essas classes quando formos trabalhar com o padrão DTO,
 * já que as classes que criamos seguindo esse padrão só servem para representar
 * a camada de domínio mesmo, essas classes só servem para armazenar os dados
 * e não possuem regras de negócio, logo, não é necessário implementar método nenhum
 */
data class Cliente(var nome: String, var sexo: String, var remuneracao: Double)