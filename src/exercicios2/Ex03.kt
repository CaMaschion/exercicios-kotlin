package exercicios2

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    println("Digite uma letra (M - Masculino, F - Feminino)")

    val letra = scan.next()

    if (letra.equals("M", ignoreCase = true)){
        println("Masculino")
    } else if (letra.equals("F", ignoreCase = true)) {
        println("Feminino")
    } else {
        println("Letra inválida")
    }
}
