package parte01

import java.util.*

fun main () {

    println("Cálcule o seu salário!! ")
    val scan = Scanner(System.`in`)

    println("Digite quanto você ganha por hora: ")
    val qtoGanhaHora = scan.nextLine().toInt()

    println("Digite quantas horas você trabalha no mês: ")
    val numHorasTrabalhadas = scan.nextLine().toInt()

    val salario = (qtoGanhaHora * numHorasTrabalhadas)

    println("Seu salário é de: $salario")
}


//
//fun main () {
//
//    println("Cálcule o seu salário!! ")
//    val scan = Scanner(System.`in`)
//
//    println("Horas por mês: ")
//    val horasPorMes = scan.nextLine().toInt()
//
//    println("Digite seu salario: ")
//    val meuSalario = scan.nextLine().toInt()
//
//    val salario = meuSalario / horasPorMes
//
//    println("Seu salário é de: $salario")
//}

