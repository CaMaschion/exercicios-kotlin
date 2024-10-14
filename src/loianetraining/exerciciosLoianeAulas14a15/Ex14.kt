package loianetraining.exerciciosLoianeAulas14a15

import java.util.*

/**Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um
 * semestre, e calcule a sua média. A atribuição de conceitos obedece a tabela abaixo:
 * média de aproveitamento conceito
 * entre 9.0 e 10.0          A
 * entre 7.5 e 9.0           B
 * entre 6.0 e 7.5           C
 * entre 4.0 e 6.0           D
 * entre 4.0 e zero          E
 *
 * O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem "APROVADO"
 * se o conceito for A, B OU C ou "REPROVADO" se o conceito for D ou E.
 * **/

fun main() {
    notas()
}

fun notas(){

    //notas, média, conceito, mensagem

    val scanPrimeiraNota = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira a nota")
    val nota1 = scanPrimeiraNota.nextInt()
    val scanSegundaNota = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira a nota")
    val nota2 = scanSegundaNota.nextInt()
    val media = (nota1 + nota2)/2

    if (media in 0..4){
        println("As notas são $nota1 e $nota2, a média é $media e o conceito correspondente é E. Reprovado")
    } else if (media in 4..6){
        println("As notas são $nota1 e $nota2, a média é $media e o conceito correspondente é D. Reprovado")
    } else if (media in 6..7.5.toInt()){
        println("As notas são $nota1 e $nota2, a média é $media e o conceito correspondente é C. Aprovado")
    } else if (media.toDouble() in 7.5..9.0) {
        println("As notas são $nota1 e $nota2, a média é $media e o conceito correspondente é B. Aprovado")
    } else
        println("As notas são $nota1 e $nota2, a média é $media e o conceito correspondente é A. Aprovado")

}
