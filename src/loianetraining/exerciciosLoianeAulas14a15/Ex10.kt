/**faça um programa que pergunte em que turno você estuda. peça para digitar M - matutino ou V - vespertino
 * ou N - noturno. Imprima a mensagem "bom dia", "boa tarde", ou "boa noite" ou "valor inválido", conforme o caso**/

package loianetraining.exerciciosLoianeAulas14a15

import java.util.*

fun main() {
    ifCases()
//    whenCases()
}

fun ifCases(){

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

fun whenCases() {
    val scan = Scanner(System.`in`)
    println("Em qual turno você estuda? M-Matutino, V-Vespertino ou N-Noturno")

    when(scan.next().lowercase()){
        "matutino" -> println("Bom dia")
        "vespertino" -> println("Boa tarde")
        "noturno" -> println("Boa noite")
        else -> println("valor inválido")
    }
}
