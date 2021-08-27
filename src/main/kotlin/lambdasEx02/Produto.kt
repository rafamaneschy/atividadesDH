package lambdasEx02

class Produto (var nome:String, var preco:Double) {

    override fun toString(): String {
        return " $nome-Preço:R$$preco "
    }
}