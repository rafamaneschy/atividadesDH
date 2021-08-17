package Revisao01.ex02FaturaLoja

fun main() {
    var item1 = Item(1, "teclado", 1, 300.0)
    var item2 = Item(2, "mouse", 1, 200.0)
    var item3 = Item(3, "monitor", 2, 1500.0)
    var item4 = Item(4, "headphone", -3, 150.0)

    var faturaA = Fatura()

    faturaA.addItens(item1)
    faturaA.addItens(item2)
    faturaA.addItens(item3)
    faturaA.addItens(item4)

    println("""Fatura 
        |------------------------------------------------------------
    """.trimMargin())

    faturaA.imprimirFatura()
}
