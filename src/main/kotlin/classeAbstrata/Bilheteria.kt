package classeAbstrata

    fun main(){

        val pista: IngressoPadrao = IngressoPadrao (50.00)
        val premium: IngressoVip = IngressoVip(50.00,30.00)
        val consumidor: String = "Rafael"

        println("""Olá, $consumidor !!
             |Que tipo de ingresso você deseja?             |
             |- Digite [1] para ingresso tipo Pista
             |- Digite [2] para ingresso tipo Premium
         """.trimMargin())

        when(readLine()!!){
            "1" -> {pista.imprimeValor()}
            "2" -> {premium.imprimeValor()}
            else -> println("Opção inválida")
        }
    }



