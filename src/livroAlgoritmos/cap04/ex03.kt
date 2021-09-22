package livroAlgoritmos

import java.util.*

//ler três valores inteiros e apresentar os valores lidos dispostos
//em ordem crescente.

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite um número:")
    var num1 = scan.nextInt()

    println("Digite um número:")
    var num2 = scan.nextInt()

    println("Digite um número:")
    var num3 = scan.nextInt()

    var x = 0

    if(num1 > num2 ){
        x = num1
        num1 = num2
        num2 = x
    }

    if (num1 > num3) {
        x = num1
        num1 = num3
        num3 = x
    }

    if (num2 > num3){
        x = num2
        num2 = num3
        num3 = x
    }

    println(num1)
    println(num2)
    println(num3)
}