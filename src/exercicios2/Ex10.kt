package exercicios2

import java.util.*

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Em qual turno você estuda? M-Matutino, V-Vespertino ou N-Noturno")
    val turno = scan.next()

    if (turno.equals("Matutino", ignoreCase = true)) {
        println("Bom dia!")
    } else if (turno.equals("Vespertino", ignoreCase = true)){
        println("Boa tarde!")
    } else if (turno.equals("Noturno", ignoreCase = true)) {
        println("Boa noite!")
    } else {
        println("Valor inválido")
    }
}
