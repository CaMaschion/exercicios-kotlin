/**faça um programa para leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada
 * por aluno e apresentar:
 * A mensagem "aprovado", se a média alcançada for maior ou igual a sete
 * A mensagem "reprovado" se a média for menor do que sete
 * A mensagem "aprovado com distinção" se a média for igual a dez**/

package loianetraining.exerciciosLoianeAulas14a15

import java.util.*

fun main (){

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite uma nota:")
    val nota = scan.nextDouble()

    println("Digite segunda nota:")
    val nota2 = scan.nextDouble()

    val media = (nota + nota2) / 2

    if (media == 10.toDouble()){
        println("Aprovado com distinção")
    } else if(media >= 7){
        println("Aluno aprovado")
    } else
        println("Aluno reprovado")
}
