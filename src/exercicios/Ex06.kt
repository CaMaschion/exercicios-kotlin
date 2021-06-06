package exercicios

import java.util.*


fun main() {

    println("Calcule a área de um círculo")
    val scan = Scanner(System.`in`).useLocale(Locale.US)

    println("Insira o raio do círculo:  ")
    val raio = scan.nextDouble()

    val area = 3.14 * (raio * raio) * 2

    println("O dobro da área do círculo é : $area ")
}
