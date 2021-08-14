package estruturaBasica

fun textosIguais(textoA:String, textoB:String): Boolean {
    return textoA != textoB
}
fun main() {
    println(textosIguais("Bola", "Bola"))
}