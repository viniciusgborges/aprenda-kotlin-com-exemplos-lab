class Formacao(
    val nome: String,
    val conteudos: List<ConteudoEducacional>
) : Matriculavel {
    private val inscritos = mutableListOf<Usuario>()

    override fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("$usuario matriculado na formação $nome.")
    }

    fun listarConteudos() {
        println("Conteúdos da formação $nome:")
        conteudos.forEach { println("Nome: ${it.nome} | Duração: ${it.duracao} | Nível: ${it.nivel}") }
    }
}