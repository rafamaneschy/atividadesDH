package classeAbstrata

class IngressoPadrao(valor: Double): Ingresso(valor) {

    override fun imprimeValor() {
        println("O valor do seu ingresso é: R$ $valor")
    }
}