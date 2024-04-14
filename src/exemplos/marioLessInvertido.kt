package exemplos

fun main() {
    marioLessInvertido()
}

fun marioLessInvertido() {

    var altura = 0

    //perguntar a altura que o usuário quer a piramide
    do {
        println("Altura:")
        altura = readLine()?.toInt()!!

    } while (altura < 1 || altura > 8) //delimitacao de andar

    //percorrendo cada andar da piramide
    for (i in 0..altura) {
        preencherAndarComTijolinhosInvert(i, altura)

    }
}

//preencher cada andar com os tijolinhos da piramide
fun preencherAndarComTijolinhosInvert(tamanhoTotalAndar: Int, distancia: Int) {

    for (t in 0..distancia - tamanhoTotalAndar) {
        print(" ")
    }
    for (j in 0..tamanhoTotalAndar) {
        print("#")
    }

    println()
}