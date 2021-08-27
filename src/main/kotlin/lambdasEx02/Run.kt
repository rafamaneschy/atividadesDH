package lambdasEx02

fun main() {

    val laticinio = Produto("Leite 1kg", 26.90)
    val frutas = Produto("Mamão kg", 4.90)
    val bebidas = Produto("Refrigerante 2L", 7.80)
    val massas = Produto("Lazanha", 4.20)

    val meuPedido = CarrinhoDeCompras(mutableListOf(laticinio, frutas, bebidas, massas))

    meuPedido.adicionaProdutos(Produto("Peito de frango",14.80))

    val caixa = Caixa(meuPedido)



}

