package exemplos

import java.util.*

//7. Escreva um algoritmo que leia um número N e imprima os N primeiros termos da sequência de Fibonacci.
fun main() {
    exZeroSete()
}

fun exZeroSete() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um número:")
    val num = scan.nextInt()
    
    var termoAnterior = 0
    var termoAtual = 1

    println("Os $num primeiros termos da sequência de Fibonacci são:")

    for (i in 1..num) {
        print("$termoAnterior ")

        val proximoTermo = termoAnterior + termoAtual
        termoAnterior = termoAtual
        termoAtual = proximoTermo
    }
}
