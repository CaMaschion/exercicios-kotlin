package exercicios2

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
