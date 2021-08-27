package lambdasEx01

val multiplicaItens: (List<Int>) -> Int = {
    var cont: Int = 1
    for( i in it) { cont *= i }
    cont
    }

fun main() {
    print(multiplicaItens(listOf(2,4,8,10,12)))
}