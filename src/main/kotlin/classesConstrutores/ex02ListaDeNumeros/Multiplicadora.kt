package classesConstrutores.ex02ListaDeNumeros

class Multiplicadora(var listaDeNumeros: ArrayList<Int>) {

    var produto: Int = 1

    fun produto(): Int {
        if (listaDeNumeros.isEmpty()) {
            return 0
        } else {
            for (numero in listaDeNumeros) {
                produto *= numero
            }
            return produto
        }
    }
}