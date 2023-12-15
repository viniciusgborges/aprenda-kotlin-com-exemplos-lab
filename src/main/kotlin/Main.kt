package org.example

import ConteudoEducacional
import Formacao
import Usuario
fun main() {
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 30)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 40, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Design Patterns", 90, Nivel.DIFICIL)
    val conteudoExtra = ConteudoEducacional("Tópico Extra")
    val conteudosFormacao = listOf(conteudo1, conteudo2, conteudo3, conteudoExtra)

    val formacao = Formacao("Desenvolvimento em Kotlin", conteudosFormacao)

    val usuario1 = Usuario()
    val usuario2 = Usuario()
    val usuario3 = Usuario()

    testarMatricula(formacao, listOf(usuario1, usuario2, usuario3))

    formacao.listarConteudos()
}

fun testarMatricula(formacao: Formacao, usuarios: List<Usuario>) {
    usuarios.forEach { formacao.matricular(it) }
}