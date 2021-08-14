package estruturaBasica

fun analisandoNumeros(numA:Int,numB:Int,numC:Int,numD:Int): Boolean{
    return ((numA > numC && numA > numD) || (numB > numC && numB > numD))
}
fun main() {
    println(analisandoNumeros(16,12,26,32))
}