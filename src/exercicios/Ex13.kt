package exercicios

import java.util.*

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Entre com o valor/hora?")
    val valorHora = scan.nextDouble()

    println("Entre com a quantidade de horas trabalhadas no mês?")
    val hora = scan.nextDouble()

    val salarioBruto = valorHora * hora
    val inss = (salarioBruto/100) * 8
    val sindicato = (salarioBruto/100) * 5
    val ir = (salarioBruto/100) * 11
    val totalDesconto = inss + sindicato + ir
    val salarioLiquido = salarioBruto - totalDesconto

    println("Salário bruto: $salarioBruto IR: $ir INSS: $inss Sindicato: $sindicato, Salário Líquido: $salarioLiquido")

}
