package lambdasEx02

class CarrinhoDeCompras ( var itensCarrinho: MutableList<Produto>) {

    fun adicionaProdutos(vararg :Produto){
        itensCarrinho.add(vararg)
    }

}

