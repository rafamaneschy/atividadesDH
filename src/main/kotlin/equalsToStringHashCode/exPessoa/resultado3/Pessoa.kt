package equalsToStringHashCode.exPessoa.resultado3

class Pessoa(var nome: String, var rg: Int) {

    override fun hashCode(): Int {
        return this.rg
    }

    override fun toString(): String {
        return "=== Nome: $nome | rg: $rg ==="
    }
}

fun main() {

    val pessoaA = Pessoa("José",545454)
    val pessoaB = Pessoa("Manoel", 545454)

    println(pessoaA == pessoaB)
    println("__________________________________")

    //return false

    println(pessoaA.hashCode())
    println(pessoaB.hashCode())
    println("__________________________________")

    println(pessoaA.toString())
    println()
    println(pessoaB.toString())

}