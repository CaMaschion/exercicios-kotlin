//faça um programa que converta metros em centrímetros
package loianetraining.exerciciosLoianeAulas11a13

import java.util.*

fun main() {

    println("Bora converter metro para centímetro")
    val scan = Scanner(System.`in`)

    println("Insira quantos metros você quer converter:  ")
    val metro = scan.nextInt()

    val centimetro = metro * 100

    println("Centrímetros: $centimetro ")
}