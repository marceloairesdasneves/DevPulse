fun main(){
    val tarefas = listOf(
        Tarefa(id = 1, titulo = "Estudar Kotlin", prioridade = Prioridade.ALTA, concluida = false),
        Tarefa(id = 2, titulo = "Fazer Compras", prioridade = Prioridade.BAIXA, concluida = true),
        Tarefa(id = 3, titulo = "Reuniao de Equipe", prioridade = Prioridade.MEDIA, concluida = false),
        Tarefa(id = 4, titulo = "Entregar Relatorio", prioridade = Prioridade.BAIXA, concluida = false)
        )

    val resultado = tarefas
        .filter { !it.concluida }
        .sortedByDescending { it.prioridade }
        .map { it.titulo.uppercase() }

    println("Tarefas pendentes prioritarias")
    resultado.forEach { titulo ->
        println("- $titulo")
    }



}