package loianetraining.exerciciosLoianeAula16a17

import java.util.*

//Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado
//ao segundo número. Nao utilize a função de potência da linguagem.

//exemplo: 3 x 3 x 3

fun main() {

    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um número: ")
    val base = scanner.nextInt()

    val scanner2 = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um número: ")
    val expoente = scanner2.nextInt()

    treze(base, expoente)
}

fun treze(base: Int, expoente: Int) {
    var resultado = 1
    for (n in 1..expoente) {
        resultado *= base
        println(resultado)
    }
}
