package exercicios

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