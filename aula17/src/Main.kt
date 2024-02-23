//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    val alunos = arrayListOf("André", "Maria", "Marcos")
    for ((indice, aluno) in alunos.withIndex()) {
        println("$indice - $aluno \n")
    }
}