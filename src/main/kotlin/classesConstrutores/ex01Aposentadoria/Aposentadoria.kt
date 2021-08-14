package classesConstrutores.ex01Aposentadoria

class Aposentadoria(var idade:Int, var sexo: String, var anosDeContribuicao:Int) {

    fun calcularAposent() {

        if (idade >= 30 && anosDeContribuicao >= 65 && sexo == "masculino" )
            return print("Verdadeiro")
        else if (idade >= 30 && anosDeContribuicao >= 60 && sexo == "feminino" )
            return print("Verdadeiro")
        else print("Falso")
    }
}


fun main() {
    val CalculoMaria = Aposentadoria(68, "feminino", 60)

    CalculoMaria.calcularAposent().toString()
}