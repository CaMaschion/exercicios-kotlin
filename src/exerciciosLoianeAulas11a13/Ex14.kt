/**faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de internet (em Mbps)
 * calcule e informe o tempo aproximado de download do arquivo usando este link(em minutos)**/
package exerciciosLoianeAulas11a13

import java.util.*

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira tamanho de um arquivo para download (MB)")
    val tamArquivo = scan.nextDouble()

    println("Velocidade Internet (Mbps)")
    val velocidadeDownload = scan.nextDouble()

    val tempo = (tamArquivo/ velocidadeDownload)

    println("O tempo aproximado de download é de $tempo minutos")

}