package exercicios2

import java.util.*

fun main (){

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite um número:")
    val num1 = scan.nextDouble()

    println("Digite um segundo número:")
    val num2 = scan.nextDouble()

    println("Digite um terceiro número:")
    val num3 = scan.nextDouble()

    if (num1 > num2 && num1 > num3) {
        println("Num1 é maior: $num1")
    } else if (num2 > num1 && num2 > num3){
        println("Num2 é maior: $num2")
    } else if (num3 > num1 && num3 > num2){
        println("Num3 é maior: $num3")
    }
}