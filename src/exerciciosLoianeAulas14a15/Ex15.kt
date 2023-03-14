package exerciciosLoianeAulas14a15

import java.util.*


/**Faça um programa que peça os 3 lados de um triangulo. O programa deverá informar se os valores podem
 * ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é:
 * equilátero, isósceles ou escaleno.
 * Dicas:
 * Três lados formam um triangulo quando a soma de quaisquer lados for maior que o terceiro;
 * Triangulo Equilátero: tres lados iguais
 * Triangulo Isósceles: quaisquer dois lados iguais
 * Triangulo Escaleno: tres lados diferentes
 * **/

fun main() {
    triangulo()
}

fun triangulo() {

    val scanPrimeiroLado = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um lado do triangulo")
    val lado1 = scanPrimeiroLado.nextInt()

    val scanSegundoLado = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um lado do triangulo")
    val lado2 = scanSegundoLado.nextInt()

    val scanTerceiroLado = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um lado do triangulo")
    val lado3 = scanTerceiroLado.nextInt()


}
