package equalsToStringHashCode.exPessoa.resultado2

class Pessoa(var nome: String, var rg: Int) {

    override fun equals(other: Any?): Boolean {
        return (other is Pessoa && other.rg == this.rg)
    }
}

fun main() {

    val pessoaA = Pessoa("José",545454)
    val pessoaB = Pessoa("Manoel", 545454)

    println(pessoaA == pessoaB)

   //return true
}