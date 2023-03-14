package exerciciosLoianeAula16a17

import java.util.*

//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido
//e continue pedindo até que o usuário informe um valor válido.

fun main(){
  nota()
}

fun nota() {

    //pedir uma nota
    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira uma nota:")
    var nota = scan.nextDouble()

    //caso o valor seja inválido
    do {
        var notaValida = false
        if(nota in 0.0..10.0) {
            notaValida = true
            println("Nota válida: $nota")
        } else {
            println("Nota $nota inválida, tente novamente")
            println("Insira uma nota:")
            nota = scan.nextDouble()
        }
        //continue pedindo até ser válido
    } while (!notaValida)

}
