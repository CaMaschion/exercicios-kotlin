package exercicios2

import java.util.*

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite um número:")
    val num1 = scan.nextInt()

    println("Digite um número:")
    val num2 = scan.nextInt()

    println("Digite um número:")
    val num3 = scan.nextInt()

    if (num1 <= num2 && num1 <= num3 && num2 <= num3){
        println("$num3 - $num2 - $num1")
    } else if (num1 <= num2 && num1 <= num3 && num3 <= num2){
        println("$num2 - $num3 - $num1")
    } else if (num2 <= num1 && num2 <= num3 && num1 <= num2){
        println("$num3 - $num1 - $num2")
    } else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
        println("$num1 - $num3 - $num2")
    } else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
        println("$num2 - $num1 - $num3")
    }else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
        println("$num1 - $num2 - $num3")
    }
}