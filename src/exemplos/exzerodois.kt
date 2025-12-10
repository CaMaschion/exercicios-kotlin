package exemplos

//2. Faça um algoritmo que imprima apenas os números ímpares de 1 a 50.
fun main() {
    exZeroDois()
}

fun exZeroDois() {

    for (i in 1..50) {
        if (i % 2 != 0) {
            println(i)
        }
    }
}