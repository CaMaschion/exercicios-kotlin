package livroalgoritmos.cap04

import java.util.*

//Efetuar a leitura de três valores numéricos (representados pela variáveis A, B e C) e processar
//o cálculo da equação completa de segundo grau utilizando a fórmula de Bhaskara (considerar
//para a solução do problema todas as possíveis condições para delta: delta < 0 - não há
//solução real, delta > 0 - há duas soluções reais e diferentes e delta = 0 - há apenas uma solução real).
//Lembre-se de que é completa a equação de segundo grau que possui todos os coeficientes A, B e C diferentes
//de zero. O programa deve apresentar respostas para todas as condições estabelecidas para delta.

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite um valor:")
    val a = scan.nextInt()

    println("Digite um segundo valor:")
    val b = scan.nextInt()

    println("Digite um terceiro valor:")
    val c = scan.nextInt()

    if (a == 0 && b == 0 && c == 0) {
        println("Não é uma equação completa de segundo grau")
    } else {
        val delta = (b * b) - 4 * a * c
        if (delta == 0) {
            val x = -b / (2 * a)
            println("Há apenas uma solução real $x")
        } else {
            if (delta > 0) {
                val x1 = (-b + delta * 2 / (2 * a))
                val x2 = (+b + delta * 2 / (2 * a))
                println("Há duas soluções : $x1, $x2")
            } else {
                println("Não existem raízes reais")
            }
        }
    }
}
