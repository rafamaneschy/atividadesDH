package `interface`

class Contrato(var numeroContrato: Int): Imprimivel {

    override var nome: String = "CONTRATO DE TRABALHO"
    override var tipoDeDocumento: String = "CONTRATO"


    override fun imprimir() {
        println("""================$nome=======================
                |
                |$tipoDeDocumento Nº: $numeroContrato""".trimMargin())
    }



}