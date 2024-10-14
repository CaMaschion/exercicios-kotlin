package loianetraining.exerciciosLoianeAulas11a13
//Faça um programa que peça um número e então mostre a mensagem "O número informado foi..."
import java.util.*

fun main() {
    println("Insira um número")

    val scan = Scanner(System.`in`)
    val number = scan.nextInt()

    println("O número informado foi: $number ")
}