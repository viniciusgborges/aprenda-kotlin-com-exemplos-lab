enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class ConteudoEducacional(
    var nome: String,
    val duracao: Int,
    val nivel: Nivel
) {
    // Construtor auxiliar para criar conteúdos com nível e duração padrão
    constructor(nome: String, duracao: Int = 60) : this(nome, duracao, Nivel.BASICO)
}