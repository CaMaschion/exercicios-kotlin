//faça um programa que pergunte quanto voce ganha por hora e o número de horas trabalhadas no mês. Calcule o mostre
//o total do seu salário no referido mês.
package exerciciosLoianeAulas11a13

import java.util.*

fun main() {

    println("Calcular salário")
    val scan = Scanner(System.`in`)

    println("Quanto você ganha por hora?")
    val hora = scan.nextInt()

    println("Quantas horas você trabalha por mês?")
    val horaTrabalhadaMes = scan.nextInt()

    val salario = horaTrabalhadaMes * hora
    println("Total do salario é de $salario")
}