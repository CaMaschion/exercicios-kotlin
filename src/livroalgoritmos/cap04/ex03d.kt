package livroalgoritmos.cap04

import java.util.*

//Ler os valores de quatro notas escolares bimestrais de um aluno representadas pelas variáveis
//N1, N2, N3 e N4. Calcular a média aritmética(variável MD1) desse aluno e apresentar a mensagem
//"Aprovado" se a média obtida for maior ou igual a 7; caso contrário, o programa deve solicitar
//a quinta nota (nota de exame, representada pela variável NE) do aluno e calcular uma nova média
//aritmética (variável MD2) entre a nota de exame e a primeira média aritmética. Se o valor da
//nova média for maior ou igual a cinco, apresentar a mensagem "Aprovado em exame"; caso contrário
//apresentar a mensagem "Reprovado". Informar também, após a apresentação das mensagens, o valor
//da média obtida pelo aluno.

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite a primeira nota:")
    val nota01 = scan.nextDouble()

    println("Digite a segunda nota:")
    val nota02 = scan.nextDouble()

    println("Digite a terceira nota:")
    val nota03 = scan.nextDouble()

    println("Digite a quarta nota:")
    val nota04 = scan.nextDouble()

    val media = (nota01 + nota02 + nota03 + nota04) / 4

    if (media >= 7) {
        println("Aluno aprovado com média $media")
    } else {
        println("Digite a nota de exame:")
        val notaExame = scan.nextDouble()
        val media2 = (notaExame + media) / 2
        if (media2 >= 5) {
            println("Aluno aprovado em exame com média $media2")
        } else {
            println("Reprovado")
        }
    }
}