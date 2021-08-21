package equalsToStringHashCode.exDataClass

data class Pessoa(val nome:String, val cpf:Int)


fun main() {
    val pessoaA = Pessoa("Rafael", 1234567)
    val pessoaB = Pessoa("Rafael", 1234567)

    println(pessoaA.toString() == pessoaB.toString()) //True

    println(pessoaB.hashCode() == pessoaA.hashCode()) //True
}