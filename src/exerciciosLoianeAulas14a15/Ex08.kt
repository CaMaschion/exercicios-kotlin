/**faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão
 * é sempre pelo mais barato**/
package exerciciosLoianeAulas14a15

import java.util.*

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Valor Produto 1:")
    val prod1 = scan.nextDouble()

    println("Valor Produto 2:")
    val prod2 = scan.nextDouble()

    println("Valor Produto 3:")
    val prod3 = scan.nextDouble()

    if(prod1 <= prod2 && prod1 <= prod3){
        println("Compre o produto 1, pois é o mais barato: $prod1")
    } else if (prod2 <= prod1 && prod2 <= prod3){
        println("Compre o produto 2, pois é o mais barato: $prod2")
    } else if (prod3 <= prod1 && prod3 <= prod2) {
        println("Compre o produto 2, pois é o mais barato: $prod3")
    }
}
