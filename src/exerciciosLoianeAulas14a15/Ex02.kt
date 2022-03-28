/**faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo**/

package exerciciosLoianeAulas14a15

import java.util.*

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um valor")
    val valor = scan.nextInt()

    if (valor >= 0){
        println("positivo")
    } else {
        println("negativo")
    }

}