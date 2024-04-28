package exemplos

fun main() {

    var troco = 0

    do {
        println("Valor:")
        troco = readLine()?.toInt() ?: 0
    } while (
        troco <= 0
    )

    val moedasDe25 = calcularQtdadeMoedasDe25(troco)
    troco -= moedasDe25 * 25

    val moedasDe10 = calcularQtdadeMoedasDe10(troco)
    troco -= moedasDe10 * 10

    val moedasDe5 = calcularQtdadeMoedasDe5(troco)
    troco -= moedasDe5 * 5

    val moedasDe1 = calcularQtdadeMoedasDe1(troco)
    troco -= moedasDe1 * 1

    println("Moedas de 25: $moedasDe25")
    println("Moedas de 10: $moedasDe10")
    println("Moedas de 5: $moedasDe5")
    println("Moedas de 1: $moedasDe1")

    val totalDeMoedas = moedasDe25 + moedasDe10 + moedasDe5 + moedasDe1
    println("Total de moedas: $totalDeMoedas")

}

// Calculate how many quarters(moedas de 25) you should give customer
fun calcularQtdadeMoedasDe25(troco: Int): Int {

    var trocoRestante = troco // Armazena o valor atual de centavos que ainda não foi convertido em moedas de 25
    var moedasDe25 = 0

    while (trocoRestante >= 25) {
        moedasDe25++
        trocoRestante -= 25
    }

    return moedasDe25

}

fun calcularQtdadeMoedasDe10(troco: Int): Int {

    var trocoRestante = troco
    var moedasDe10 = 0

    while (trocoRestante >= 10) {
        moedasDe10++
        trocoRestante -= 10
    }

    return moedasDe10

}

fun calcularQtdadeMoedasDe5(troco: Int): Int {

    var trocoRestante = troco
    var moedasDe5 = 0

    while (trocoRestante >= 5) {
        moedasDe5++
        trocoRestante -= 5
    }

    return moedasDe5

}

fun calcularQtdadeMoedasDe1(troco: Int): Int {

    var trocoRestante = troco
    var moedasDe1 = 0

    while (trocoRestante >= 1) {
        moedasDe1++
        trocoRestante -= 1
    }

    return moedasDe1

}

