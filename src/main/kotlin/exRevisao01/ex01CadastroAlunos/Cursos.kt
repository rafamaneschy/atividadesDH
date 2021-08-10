package exRevisao01.ex01CadastroAlunos

import java.util.ArrayList

class Cursos(
    var nome: String,
    var professorResponsavel: Professores,
    var listaAlunos: ArrayList<Alunos>,
    var listaAulas: ArrayList<Aulas>
) {
}