package exercicios2

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    println("Digite uma letra:")

    when (scan.next()) {
        "a" -> println("vogal")
        "e" -> println("vogal")
        "i" -> println("vogal")
        "o" -> println("vogal")
        "u" -> println("vogal")
        else -> println("consoante")
    }
}