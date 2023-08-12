package exerciciosLoianeAula16a17

import java.util.*

//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
//O usuário deve informar de qual número ele deseja ver a tabuada.
//2x1 = 2
//2x2 = 4
fun main() {

    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um número: ")
    val tabuada = scanner.nextInt()

    doze(tabuada)

}
fun doze(numero: Int) {

    for (n in 1..10){
        val resultado = numero * n
        println("$n x $numero = $resultado")
    }

}
