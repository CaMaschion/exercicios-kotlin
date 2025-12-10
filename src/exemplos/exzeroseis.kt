package exemplos

//6. Escreva um algoritmo que imprima os 10 primeiros números pares a partir de 0.
fun main() {
    exZeroSeis()

}
fun exZeroSeis() {

    for (i in 0..20){
        if (i % 2 == 0){
            println(i)
        }
    }
}

fun exZeroSeis1() {

    for (i in 0..18 step 2){
        if (i % 2 == 0){
            println(i)
        }
    }
}

fun exZeroSeis2() {
    var count = 0
    var num = 0
    while (count < 10) { //total de pares que quero imprimir
        println(num)
        num += 2
        count++
    }
}