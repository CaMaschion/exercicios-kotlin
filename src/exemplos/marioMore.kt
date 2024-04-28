package exemplos

fun main() {
    marioMore()
}

fun marioMore() {

    var andares = 0

    do {
        println("Altura:")
        andares = readLine()?.toInt()!!

    } while (andares < 1 || andares > 8)

    //construindo a piramide
    for (andar in 1..andares) {
        piramide(andar, andares)
    }

}

//imprimindo os tijolos

fun piramide(tijolos: Int, distancia: Int) {

    for (espaco in 1..distancia - tijolos) {
        print(" ")
    }
    for (tijolo in 1..tijolos) {
        print("#")
    }

    for (espaco in 0..2) {
        print(" ")
    }

    for (tijolo in 1..tijolos) {
        print("#")
    }

    println()
}