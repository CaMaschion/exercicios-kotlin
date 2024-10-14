/**faça um programa que peça a temperatura em graus farenheit, transforme e mostre a temperatura em graus celsius
 C = (5*(f-32)/9)**/
package loianetraining.exerciciosLoianeAulas11a13

import java.util.*

fun main(){

    println("Calcular temperatura")
    val scan = Scanner(System.`in`)

    println("Insira a temperatura em graus fahrenheit")
    val f = scan.nextInt()

    val celsius = ((f-32)*5)/9

    println("A temperatura em grau celsius é $celsius")

}