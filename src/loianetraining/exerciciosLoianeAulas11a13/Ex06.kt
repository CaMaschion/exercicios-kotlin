//faça um programa que peça o raio de um círculo, calcule e mostre sua área
package loianetraining.exerciciosLoianeAulas11a13

import java.util.*

fun main() {

    println("Calcule a área de um círculo")
    val scan = Scanner(System.`in`).useLocale(Locale.US)

    println("Insira o raio do círculo:  ")
    val raio = scan.nextDouble()

    val area = 3.14 * (raio * raio)

    println("A área do círculo é : $area ")
}
