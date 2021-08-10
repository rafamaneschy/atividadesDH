package exRevisao02

class Item(
    var numeroIten: Int,
    var descricao: String,
    var quantidade: Int,
    var precoUnit: Double
) {
    init {
        if (numeroIten < 0) numeroIten = 0

        if (precoUnit < 0) precoUnit = 0.0
    }
}


