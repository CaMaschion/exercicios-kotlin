package kotlin

//WHEN -> É uma estrutura de controle que pode ser usada de duas maneiras: como declaração (statement)
// e como expressāo (expression)

fun main() {

    /**

    DECLARAÇÃO (STATEMENT) => quando usamos o when como declaracao, estamos utilizando-o para realizar acoes
    com base na correspondencia de um valor. Neste caso, o when nao retorna um valor, apenas executa um bloco de código
     **/

    val x = 5

    when (x) {

        1 -> println("x é 1")
        2 -> println("x é 2")
        3, 4 -> println("x é 3 ou 4")
        in 5..10 -> println("x esta entre 5 e 10")
        else -> println("x nao corresponde a nenhum dos casos")

    }

    /**QUANDO USAR "WHEN" COMO DECLARAÇÃO(STATEMENT)

    1. executar funções sem necessidade de retorno
    2. código de controle de fluxo

    Ex: quando você está apenas imprimindo mensagens ou executando funções específicas.
     OU quando você está controlando o fluxo do programa com base em condiçoes e não precisa usar o resultado
     **/

    val status = "success"
    when (status) {
        "success" -> println("Operação bem-sucedida!")
        "error" -> println("Ocorreu um erro.")
        else -> println("Status desconhecido.")
    }

    val age = 18
    when{
        age < 18 -> println("menor de idade")
        age >= 18 -> println("maior de idade")
    }


    //----------------------------------------------------------------------------------------------------------

    /**
    EXPRESSAO (EXPRESSION) => quando usamos o "when" como expressao, estamos utilizando-o para retornar um valor com base  na
    correspondencia de um valor. Isso é útil quando queremos atribuir o resultado do "when" a uma variável.
     **/

    val y = 5

    val result = when (y) {
        1 -> "x é 1"
        2 -> "x é 2"
        3, 4 -> "x é 3 ou 4"
        in 5..10 -> "y está entre 5 e 10"
        else -> "x não corresponde a nenhum dos casos"
    }

    println(result)

    /**QUANDO USAR "WHEN" COMO EXPRESSÃO (EXPRESSION)

    1. retornar um valor com base em condições
    2. reduzir código redundante

    Ex: Se você precisa avaliar um conjunto de condições e retornar um valor baseado nessas condições.
    Útil para inicializar variáveis com valores condicionais ou para retornar valores em funções.
    OU Quando você deseja evitar a repetição de código, especialmente na inicialização de variáveis,
    utilizando when para atribuir um valor diretamente.
     **/

    val score = 85
    val grade = when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        score >= 60 -> "D"
        else -> "F"
    }

    println("Nota: $grade")


    val temperature = 30
    val weather = when (temperature) {
        in -50..0 -> "Frio extremo"
        in 1..15 -> "Frio"
        in 16..25 -> "Agradável"
        in 26..35 -> "Quente"
        else -> "Calor extremo"
    }

    println("O clima está: $weather")


}
