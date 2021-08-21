package equalsToStringHashCode.exCoca.resultado3

class Coca(val tamanho:Int, var preco:Double) {

    override fun hashCode(): Int {
        return this.tamanho
    }

    override fun toString(): String {
        return "=== Tamanho: $tamanho ml | Valor: R$ $preco ==="
    }
}

fun main() {
    val cocaA = Coca(1000,8.70)
    val cocaB = Coca(1000,7.50)

    println(cocaA == cocaB)
    println("__________________________________")

    //return false

    println(cocaA.hashCode())
    println(cocaB.hashCode())
    println("__________________________________")

    println(cocaA.toString())
    println()
    println(cocaB.toString())

}