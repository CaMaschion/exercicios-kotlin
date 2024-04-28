package livroAlgoritmos.cap5

//elaborar um programa que apresente como resultado os quadrados armazenados
//na memória dos números inteiros existentes na faixa de valores de 15 a 200.

/**  Passo a Passo
 *
 * 1 Definir intervalos de numeros
 * 2 calcular o quadrado dos numeros
 * 3 armazenar o resultado
 * 4 iteracao sobre o intervalo de numeros
 * 5 apresentacao dos resultados
 *
 * **/

fun main() {

//    println("Digite seu nome:")
//    val nome = readLine() // Lê a entrada do usuário a partir do console
//    println("Olá, $nome!")

    //Definir intervalos de numeros
    val numero = (15..200).toList()

//    calcular o quadrado dos numeros
    val quadrado = numero.map { it * it }

}