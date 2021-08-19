package `interface`

class Orcamento(var valorOrcamento:Double): Imprimivel{

    override var nome: String = "ORÇAMENTO DE SERVIÇO"
    override var tipoDeDocumento: String = "ORÇAMENTO"


    override fun imprimir() {
        println("""================$nome=======================
                |
                |$tipoDeDocumento: R$ $valorOrcamento""".trimMargin())
    }
}