/**As organizações tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para
 * desenvolver o programa que calculará os reajustes.
 * faça um programa que recebe o salário de um colaborador e o reajuste segundo
 * o seguinte critério, baseado no salário atual:
 *
 * salários até R$ 280,00(incluindo): aumento de 20%
 * salários até R$ 280,00 a R$ 700,00: aumento de 15%
 * salários até R$ 700,00 a R$1500,00: aumento de 10%
 * salários até R$ 1500,00 em diante: aumento de 5% após o aumento realizado.
 *
 *
 * salario 1000
 * reajustado em 5% = novo salario (com aumento)
 *
 *
 * INFORME NA TELA:
 *
 * o salário antes do reajuste
 * o percentual de aumento aplicado
 * o valor do aumento
 * o novo salário após o aumento
 * **/

package exerciciosLoianeAulas14a15

import java.util.*

fun main() {
    calculoSalario()
}

fun calculoSalario() {

    var percentual = 0
    var aumento = 0.0
    var novoSalario = 0.0

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira o valor do seu salário")
    var salario = scan.nextDouble()

    //calcular percentual
    if (salario <= 280) {
        percentual = 20
    } else if (salario > 280 && salario < 700) {
        percentual = 15
    } else if (salario >= 700 && salario < 1500) {
        percentual = 10
    } else {
        percentual = 5
    }

    //calcular aumento
    aumento = (salario/100) * percentual
    novoSalario = salario + aumento

    println(
        "O salário antes do reajuste era de $salario, " +
                " o percentual de aumento aplicado foi de $percentual," +
                " o valor do aumento foi de $aumento e o novo salário é de $novoSalario"
    )

}
