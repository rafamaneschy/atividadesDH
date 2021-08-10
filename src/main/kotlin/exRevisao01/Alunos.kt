package exRevisao01

class Alunos(var raID: Int, var nome: String, var sobrenome: String, var turmas: Turmas) {

    fun assistirAula(){
        println("Assistiu Aula")
    }
    fun fazerLicao(){
        println("Fez a lição")
    }
}