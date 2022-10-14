package exerciciosLoianeAulas14a15

import java.util.*

fun main() {
    calcularFolhaPagamento()
}

fun calcularFolhaPagamento() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira o valor da sua hora")
    val valorHora = scan.nextDouble()

    val scan2 = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira a quantidade de horas trabalhadas no mês")
    val quantidadeHora = scan2.nextDouble()

    //salario bruto
    val salarioBruto = (valorHora * quantidadeHora)

    //IR
    var percentualIr = 0

    if (salarioBruto <= 900) {
        percentualIr = 0
    } else if ( salarioBruto > 900 && salarioBruto <= 1500){
        percentualIr = 5
    } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
        percentualIr = 10
    } else if (salarioBruto > 2500){
        percentualIr = 20
    }

    //IMPOSTO DE RENDA
    val ir = (salarioBruto / 100) * percentualIr

    //INSS
    val inss = (salarioBruto / 100) * 10

    //FGTS
    val fgts = (salarioBruto / 100) * 11

    //salario liquido
    val descontos = ir + inss
    val salarioLiquido = salarioBruto - descontos

    println("Salário bruto: $salarioBruto, percentual do IR: $percentualIr %, valor do IR: $ir, INSS: $inss, " +
            "FGTS: $fgts, total de descontos: $descontos, Salário Líquido: $salarioLiquido")


}