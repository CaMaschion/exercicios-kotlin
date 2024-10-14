/**faça um programa que leia três números e mostre o maior e o menor deles**/
package loianetraining.exerciciosLoianeAulas14a15

import java.util.*

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite um número:")
    val num1 = scan.nextInt()

    println("Digite um número:")
    val num2 = scan.nextInt()

    println("Digite um número:")
    val num3 = scan.nextInt()

    if (num1 >= num2 && num1 >= num3) {
        println("Num1 é maior: $num1")
    } else if (num2 >= num1 && num2 >= num3){
        println("Num2 é maior: $num2")
    } else if (num3 >= num1 && num3 >= num2){
        println("Num3 é maior: $num3")
    }

    if (num1 <= num2 && num1 <= num3) {
        println("Num1 é menor: $num1")
    } else if (num2 <= num1 && num2 <= num3){
        println("Num2 é menor: $num2")
    } else if (num3 <= num1 && num3 <= num2){
        println("Num3 é menor: $num3")
    }
}