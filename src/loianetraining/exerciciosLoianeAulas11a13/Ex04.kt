//faça um programa que peça as 4 notas bimestrais e mostre a média
package loianetraining.exerciciosLoianeAulas11a13

import java.util.*

fun main() {

    println("Média das provas bimestrais")
    val scan = Scanner(System.`in`)

    println("Insira a nota da primeira prova: ")
    val nota1 = scan.nextInt()

    println("Insira a nota da segunda prova: ")
    val nota2 = scan.nextInt()

    println("Insira a nota da terceira prova: ")
    val nota3 = scan.nextInt()

    println("Insira a nota da quarta prova: ")
    val nota4 = scan.nextInt()

    val resultado = (nota1 + nota2 + nota3 + nota4) / 4

    println("A média é : $resultado ")
}