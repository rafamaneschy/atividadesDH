package `interface`

class Contrato: Imprimivel {
    override var nome: String = "CONTRATO DE TRABALHO"

    override var tipoDeDocumento: String = "CONTRATO"


    override fun imprimir() {
        println("Eu sou $tipoDeDocumento, $tipoDeDocumento")
    }
}