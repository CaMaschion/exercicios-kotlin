/**faça um programa que verifique se uma letra digitada é vogal ou consoante**/

package exerciciosLoianeAulas14a15

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    println("Digite uma letra:")

    when (scan.next()) {
        "a" -> println("vogal")
        "e" -> println("vogal")
        "i" -> println("vogal")
        "o" -> println("vogal")
        "u" -> println("vogal")
        else -> println("consoante")
    }

    //resolucao em java

//    if(letra.length() > 1) {
//        System.out.println("Não é uma letra válida")
//    } else {
////    switch(letra){
////        case "a":
////        case "e":
////        case "i":
////        case "o":
////        case "u": System.out.println("vogal"); break
////        case "A":
////        case "E":
////        case "I":
////        case "O":
////        case "U":
////        default: System.out.println("consoante")
////    }
//    }

}

