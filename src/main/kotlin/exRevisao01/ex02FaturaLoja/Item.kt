package exRevisao01.ex02FaturaLoja

class Item(
    var numeroIten: Int,
    var descricao: String,
    var quantidade: Int,
    var precoUnit: Double
) {
    init {
        if (quantidade < 0) quantidade = 0

        if (precoUnit < 0) precoUnit = 0.0
    }
}


