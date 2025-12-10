/*package kotlin

ESTRUTURAS DE REPETICAO => também conhecidas como loops, são fundamentais para executar um bloco
de código várias vezes de forma eficiente

fun main() {

    /**
     * FOR => O loop for é utilizado para iterar sobre uma sequência de elementos, como um intervalo (range),
     * uma lista ou um array
     **/

    sintaxe básica
    for (item in collection) {
        //bloco de código a ser executado
    }

    //exemplo com intervalo (range):
    for (i in 1..5) {
        println(i)
    }

    //exemplo com lista
    val frutas = listOf("maca", "banana", "cereja")
    for (fruta in frutas) {
        println(fruta)
    }

    //intervalo com passo e intervalo decrescente
    for (i in 1..10 step 2) {
        println(i)
    }

    for (i in 10 downTo 1 step 2) {
        println(i) // Imprime 10, 8, 6, 4, 2
    }

    /**
     * ForEach => é uma função de extensão em coleções e arrays, fornecendo uma maneira funcional de iterar sobre elementos.
     * É muito usado com arrays e coleções para utilizar as funcionalidades map, filter, sort...
     */

    //sintaxe básica
    collection.forEach { item ->
        // bloco de código a ser executado
    }

    //exemplo:
    val frutinhas = listOf("maçã", "banana", "cereja")
//    frutinhas.forEach { fruta ->
//        println(fruta) // Imprime cada fruta da lista
//    }

    /**
     * While => O loop while executa um bloco de código enquanto uma condição especifica é verdadeira.
     */

    //sintaxe básica
    while (condição) {
        // bloco de código a ser executado
    }

    //exemplo
    var i = 1
    while (i <= 5) {
        println(i) // Imprime números de 1 a 5
        i++
    }

    /**
     * do-while => O loop do-while é semelhante ao while, mas garante que o bloco de código seja executado
    * pelo menos uma vez, pois a condição é verificada após a execução do bloco.
     */

    //sintaxe básica
    do {
        // bloco de código a ser executado
    } while (condição)

    //exemplo
    var i = 1
    do {
        println(i) // Imprime números de 1 a 5
        i++
    } while (i <= 5)

 */
