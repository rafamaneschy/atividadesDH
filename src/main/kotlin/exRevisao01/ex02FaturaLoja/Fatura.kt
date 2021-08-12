package exRevisao01.ex02FaturaLoja

import java.util.ArrayList

class Fatura() {

    private var listaDeItens = ArrayList<Item>()

    fun addItens(item: Item) {
        listaDeItens.add(item)
    }

    fun totalDaFatura(): Double {
        var total = 0.0
        var cont = 0
        for (cont in listaDeItens.indices) {
            total += ((listaDeItens[cont].precoUnit) * (listaDeItens[cont].quantidade))
        }
        return total
    }

    fun imprimirFatura() {
        var cont = 0
        for (cont in listaDeItens.indices) {
            println("Ítem ${listaDeItens[cont].numeroIten} | ${listaDeItens[cont].descricao} | Qtd ${listaDeItens[cont].quantidade} | Preço unit. R$ ${listaDeItens[cont].precoUnit} | Valor R$ ${totalDaFatura()} ")
        }
        println("")
        println("Valor Total da Nota: R$ ${totalDaFatura()}")
    }
    }

