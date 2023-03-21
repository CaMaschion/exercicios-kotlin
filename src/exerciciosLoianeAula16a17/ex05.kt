package exerciciosLoianeAula16a17

import java.util.*

//altere o programa anterior permitindo ao usuário informar as populacoes e as taxas de crescimento
//inicias. Valide a entrada e permita repetir a operacao.

fun main() {
    exCinco()
}

fun exCinco(){

    val scanHabitantes = Scanner(System.`in`).useLocale(Locale.US)
    val scanTaxa = Scanner(System.`in`).useLocale(Locale.US)

    var anos = 0

    println("Insira a quantidade de habitantes de A:")
    var habitantesPopA: Double = scanHabitantes.nextDouble()

    println("Insira a taxa de crescimento de A:")
    val taxaPopA: Double = scanTaxa.nextDouble()

    println("Insira a quantidade de habitantes de B:")
    var habitantesPopB: Double = scanHabitantes.nextDouble()

    println("Insira a taxa de crescimento de B:")
    val taxaPopB: Double = scanTaxa.nextDouble()

    do {

        val crescimentoPopA = (habitantesPopA * taxaPopA) / 100
        habitantesPopA += crescimentoPopA

        val crescimentoPopB = (habitantesPopB * taxaPopB) / 100
        habitantesPopB += crescimentoPopB

        anos++

    } while (habitantesPopA < habitantesPopB)
    println("Número de anos necessários $anos")

}
