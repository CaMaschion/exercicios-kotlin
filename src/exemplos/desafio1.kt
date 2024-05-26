package exemplos

import java.util.*

//hora que acorda = 7am
//hora que dorme = 22pm
// quantidade de água = 3litros = 3000ml
//quantos litros por hora tenho que beber?


fun main() {

    val horario1 = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite o horário que você acorda:")
    val horarioAcorda = horario1.nextInt()

    val horario2 = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite o horário que você dorme:")
    val horarioDorme = horario2.nextInt()

    val quantidadeTotalDeAgua = 3000
    val quantidadeDeHoras = horarioDorme - horarioAcorda
    val quantidadeDeAguaPorHora = quantidadeTotalDeAgua/quantidadeDeHoras

    println("Você precisa beber $quantidadeDeAguaPorHora ml de água por hora")

}