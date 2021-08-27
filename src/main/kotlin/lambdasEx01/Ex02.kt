package lambdasEx01

val validaEmail: (String) -> Boolean = {
    var contains = it.contains("@")
    true
}

fun main() {

    validaEmail("rafamaneschy@gmail.com")
}

