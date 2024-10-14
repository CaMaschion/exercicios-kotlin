/**tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte
 * fórmula: (72.7*altura)-58 **/
package loianetraining.exerciciosLoianeAulas11a13

import java.util.*

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira sua altura:")
    val altura = scan.nextDouble()

    val pesoIdeal = (72.7 * altura) - 58

    println("Seu peso ideal é de $pesoIdeal")
}
