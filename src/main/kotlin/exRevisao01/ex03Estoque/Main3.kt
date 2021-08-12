package exRevisao01.ex03Estoque

fun main() {

    var estoque = Estoque("TV", 20, 5)


    estoque.mudarNome("TV 55`")

    estoque.mudarQtdMinima(8)

    estoque.repor(5)

    estoque.darBaixa(5)

    estoque.mostra()

    estoque.precisaRepor()
}