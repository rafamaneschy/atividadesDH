package `interface`

class Documento(): Imprimivel{

    override var nome: String = "DOCUMENTO"

    override var tipoDeDocumento: String = "RG"


    override fun imprimir(){
       println("Eu sou $tipoDeDocumento, $tipoDeDocumento")
    }
}