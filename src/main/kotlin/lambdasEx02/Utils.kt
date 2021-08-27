package lambdasEx02

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.math.nextUp


val cabecalhoDoComprovante: () -> Unit = { println("########## DH Super Market ##########") }

val dataDaCompra: () -> String = { LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))}

val imprimeListaDeCompra: (itensCarrinho: MutableList<Produto>) -> Unit = {
    for (itensCarrinho in it)
        println("$itensCarrinho")
}

val adicionaRodape: (listaDeCompras: MutableList<Produto>) -> Double = {
        lista -> lista.map { it.preco }.sum().nextUp()
}

