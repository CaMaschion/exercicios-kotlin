package exemplos

fun main() {
    marioLessInvertido()
}

fun marioLessInvertido() {

    var andares = 0

    //perguntar a altura que o usuário quer a piramide
    do {
        println("Altura:")
        andares = readLine()?.toInt()!!

    } while (andares < 1 || andares > 8) //delimitacao de andar

    //percorrendo cada andar da piramide
    for (andar in 0..andares) {
        preencherAndarComTijolinhosInvert(andar, andares)

    }
}

//preencher cada andar com os tijolinhos da piramide
fun preencherAndarComTijolinhosInvert(tijolos: Int, distancia: Int) {

    for (t in 0..distancia - tijolos) {
        print(" ")
    }
    for (j in 0..tijolos) {
        print("#")
    }

    println()
}