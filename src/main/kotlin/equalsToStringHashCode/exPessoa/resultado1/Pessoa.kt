package equalsToStringHashCode.exPessoa.resultado1

class Pessoa(var nome: String, var rg: Int) {

}

fun main() {

    val pessoaA = Pessoa("José",545454)
    val pessoaB = Pessoa("Manoel", 545454)

    println(pessoaA == pessoaB)
    //resultado false, cada objeto pessoa aponta pra um endereço de memória

}