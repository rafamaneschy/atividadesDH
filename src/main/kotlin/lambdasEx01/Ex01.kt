package lambdasEx01

val somar = { a: Int, b: Int -> (a + b) }

val subtrair: (Int, Int) -> Int = {a: Int, b: Int -> a - b}

val multiplicar = { a: Int, b: Int -> (a * b) }

val dividir = { a: Int, b: Int -> (a / b) }

fun main() {

    println(somar(50,30))
    println(subtrair(80,60))
    println(multiplicar(20,10))
    println(dividir(100,20))
}