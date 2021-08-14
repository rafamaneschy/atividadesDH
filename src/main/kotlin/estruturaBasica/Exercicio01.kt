package estruturaBasica

fun maiorValor(numA: Int, numB: Int, numC: Int): Int {
    return if (numA > numB && numA > numC) numA
    else if (numB > numC) numB
    else numC
}
fun main() {
    println(maiorValor(10,15,20))
}