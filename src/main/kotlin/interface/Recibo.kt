package `interface`

class Recibo(var numeroRecibo: Int): Imprimivel {

    override var nome: String = "RECIBO DE COMPRA E VENDA"
    override var tipoDeDocumento: String = "RECIBO"


    override fun imprimir() {
        println("""================$nome=======================
                |
                |$tipoDeDocumento Nº: $numeroRecibo""".trimMargin())
    }
}