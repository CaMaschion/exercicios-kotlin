package loianetraining.exerciciosLoianeAulas11a13
//faça um programa que peça dois números e imprima a soma
import java.util.*

fun main() {

    println("Vamos somar?")
    val scan = Scanner(System.`in`)

    println("Insira um número: ")
    val number1 = scan.nextInt()

    println("Insira mais um número: ")
    val number2 = scan.nextInt()

    val resultado = number1 + number2

    println("A soma é: $resultado ")
}