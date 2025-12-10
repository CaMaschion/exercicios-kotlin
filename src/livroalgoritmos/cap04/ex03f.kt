package livroalgoritmos.cap04

import java.util.*

//Ler três valores inteiros representados pelas variáveis A,B e C e apresentar os valores lidos
//dispostos em ordem crescente. Dica: utilizar tomada de decisão sequencial, propriedade distributiva
//e troca de valores.

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite um valor:")
    val a = scan.nextInt()

    println("Digite um segundo valor:")
    val b = scan.nextInt()

    println("Digite um terceiro valor:")
    val c = scan.nextInt()

    if (a < b) {
        if (b < c) {
            println("$a, $b, $c")
        } else if (a < c) {
            println("$a, $c, $b")
        } else {
            println("$c, $a, $b")
        }
    } else if (b < c) {
        if (a < c) {
            println("$b, $a, $c")
        } else {
            println("$b, $c, $a")
        }
    } else {
        println("$c, $b, $a")
    }
}
