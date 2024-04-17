package exemplos

fun main() {
    marioLess()
}

fun marioLess() {

    var andares = 0

    //perguntar a altura que o usuário quer a piramide
    do {
        println("Altura:")
        andares = readLine()?.toInt()!!

    } while (andares < 1 || andares > 8)

    //contruindo a piramide
    for (andar in 0..andares) {
        val quantidadeDeTijolos = andar
        preencherAndarComTijolinhos(quantidadeDeTijolos)
    }
}

//preencher cada andar com os tijolinhos da piramide
fun preencherAndarComTijolinhos(quantidadeDeTijolos: Int) {

    for (tijolo in 0..quantidadeDeTijolos) {
        print("#")
    }
    println()
}
