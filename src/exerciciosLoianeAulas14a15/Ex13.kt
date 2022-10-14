package exerciciosLoianeAulas14a15

import java.util.*

/**
 * Faça um programa que leia um número e exiba o dia correspondente da semana. (1 - domingo
 * 2 - segunda...), se digitar outro valor deve aparecer valor inválido**/

fun main(){
    diaDaSemana()
}
fun diaDaSemana(){

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um número para que seja exibido o dia da semana correspondente")
    val diaSemana = scan.nextInt()

    when (diaSemana) {
        1 -> println("Segunda")
        2 -> println("Terça")
        3 -> println("Quarta")
        4 -> println("Quinta")
        5 -> println("Sexta")
        6 -> println("Sábado")
        7 -> println("Domingo")
        else -> {
            println("valor inválido")
        }
    }
}

