/**Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre
 * o total do seu salário no referido mês, sabendo que são descontados 11% para o imposto de renda, 8% para o INSS
 * e 5% para o sindicato, faça um programa que nos dê:
 * a quanto pagou ao INSS
 * b. quanto pagou ao sindicato
 * c.o salário líquido
 * d.calcule os descontos e o salário líquido, conforme a tabela abaixo:
 * + salário Bruto: R$ - ir(11%): R$ - inss(8%): R$ - sindicato (5%): R$ = salário líquido: R$**/

package exerciciosLoianeAulas11a13

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
