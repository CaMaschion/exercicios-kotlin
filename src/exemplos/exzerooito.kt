package exemplos

import java.util.*

//8. Faça um algoritmo que receba um vetor com 10 valores inteiros e imprima apenas os valores maiores que 50.
fun main() {
    val scan = Scanner(System.`in`)
    val vetor = IntArray(10)

    println("Digite 10 números inteiros:")
    for (i in vetor.indices) {
        print("Número ${i + 1}: ")
        vetor[i] = scan.nextInt()
    }

    filtrarVetor(vetor = vetor)
}

fun exZeroOito() {
    val scan = Scanner(System.`in`).useLocale(Locale.US)
    val vetor = IntArray(10)

    println("Insira 10 valores inteiros:")

    //ler os numeros e armazenar no vetor
    for (i in vetor.indices) {
        print("Número ${i + 1}: ")
        vetor[i] = scan.nextInt() //le o valor e armazena a posicao i do vetor
    }

    println("Números maiores que 50:")

    //percorre o vetor e imprime os numero maiores que 50
    for (valor in vetor) {
        if (valor > 50) {
            println(valor)
        }
    }

}

fun filtrarVetor(vetor: IntArray) {
    vetor.filter { it > 50 }.forEach(::println)
}

