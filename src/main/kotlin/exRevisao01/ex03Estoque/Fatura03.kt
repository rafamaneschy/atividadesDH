package exRevisao01.ex03Estoque

class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {

    init {
        qtdAtual >= 0
        qtdMinima >= 0
    }

    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int) {
        this.qtdMinima = qtdMinima
    }

    fun repor(qtd: Int) {
        qtdAtual += qtd
    }

    fun darBaixa(qtd: Int) {
        qtdAtual -= qtd
    }

    fun mostra() {
        println(
            """            
            |Produto : $nome
            |Qtd mínima: $qtdMinima
            |Qtd atual: $qtdAtual
            |
        """.trimMargin()
        )
    }

    fun precisaRepor():Boolean {
        return qtdAtual <= qtdMinima
    }



}