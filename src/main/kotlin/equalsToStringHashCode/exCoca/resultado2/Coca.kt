package equalsToStringHashCode.exCoca.resultado2

class Coca(val tamanho:Int, var preco:Double) {

    override fun equals(other: Any?): Boolean {
        return (other is Coca && other.tamanho == this.tamanho)
    }
}

fun main() {
    val cocaA = Coca(1000,8.70)
    val cocaB = Coca(1000,7.50)

    println(cocaA == cocaB)

    //return true

}