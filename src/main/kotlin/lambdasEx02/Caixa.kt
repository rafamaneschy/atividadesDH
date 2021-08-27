package lambdasEx02

class Caixa(carrinhoDeCompras: CarrinhoDeCompras) {


    fun fechamentoDeConta(
        cabecalhoDaCompra: Unit,
        dataDacompra: Unit,
        imprimeListaDeCompra: (itensCarrinho: MutableList<Produto>) -> String,
        adicionaRodape: (lista: MutableList<Produto>) -> Double): String {
       return """
            $cabecalhoDaCompra
            Data: $dataDacompra
            Item: $imprimeListaDeCompra
            Valor Total: $adicionaRodape
        """.trimIndent()
    }
}