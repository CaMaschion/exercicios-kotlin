package parte01

import java.util.*

fun main() {

    println("Insira 4 notas: ")

    val scan = Scanner(System.`in`)

    val nota1 = scan.nextLine().toInt()
    val nota2 = scan.nextLine().toInt()
    val nota3 = scan.nextLine().toInt()
    val nota4 = scan.nextLine().toInt()

    val media = (nota1 + nota2 + nota3 + nota4) / 4

    println("A média das notas é: $media")

}