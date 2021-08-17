package `interface`

class Foto: Imprimivel {
    override var nome: String = "FOTO"

    override var tipoDeDocumento: String = "SELFIE"


    override fun imprimir() {
        println("Eu sou $tipoDeDocumento, $tipoDeDocumento")
    }
}