package loianetraining.exerciciosLoianeAula16a17

//supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento
//de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.

//Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse
//ou iguale a população do país B, mantidas as taxas de crescimento.

//populacao país A = 80000 habitantes; taxa de crescimento = 3%
//população país B = 200000 habitantes; taxa de crescimento = 1.5%

fun main() {
    anos()
}

fun anos() {

    var popA = 80000.0
    var popB = 200000.0
    var total = 0

    do {
        val crescimentoPopA = (popA * 3) / 100
        val crescimentoPopB = (popB * 1.5) / 100
        popA += crescimentoPopA
        popB += crescimentoPopB
        total++

    } while (popA < popB)
    println("Quantidade de anos necessários $total")

//    while (popA < popB) {
//
//        popA += (popA * 3) / 100
//        popB += (popB * 1.5) / 100
//        total++
//    }
//
//    println("População A $popA")
//    println("População B $popB")
//    println("Quanridade de anos necessários $total")
}
