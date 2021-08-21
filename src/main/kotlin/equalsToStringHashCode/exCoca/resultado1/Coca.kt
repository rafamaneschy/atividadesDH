package equalsToStringHashCode.exCoca.resultado1

class Coca(val tamanho:Int, var preco:Double) {

}

fun main() {
    val cocaA = Coca(1000,8.70)
    val cocaB = Coca(1000,7.50)

    println(cocaA == cocaB)
    //resultado false
}