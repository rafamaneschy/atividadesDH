package classeAbstrata

class IngressoVip(valor:Double, private val valorAdicional: Double): Ingresso(valor) {

    override fun imprimeValor() {
       println("O valor do seu ingresso é: R$ ${valor + valorAdicional}")
    }

}