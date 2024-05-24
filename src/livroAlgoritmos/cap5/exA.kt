package livroAlgoritmos.cap5

//elaborar um programa que apresente como resultado os quadrados armazenados
//na memória dos números inteiros existentes na faixa de valores de 15 a 200.

/**  Passo a Passo
 *
 * 1 Iniciar o Contador: Configure um contador para iniciar em 15 e terminar em 200.
 * Este contador vai passar por cada número nesse intervalo.
 * 2 Calcular o Quadrado: Para cada número nesse intervalo, calcule o quadrado do número.
 * 3 armazenar o resultado: Armazene cada resultado (quadrado do número) em uma estrutura de dados.
 * Uma lista seria adequada para isso se você estiver usando uma linguagem de programação que suporte listas
 * (como Python, Java, C#).
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