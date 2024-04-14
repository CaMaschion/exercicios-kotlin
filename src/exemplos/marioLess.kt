package exemplos

fun main() {
    marioLess()
}

fun marioLess() {

    var altura = 0

    //perguntar a altura que o usuário quer a piramide
    do {
        println("Altura:")
        altura = readLine()?.toInt()!!

    } while (altura < 1 || altura > 8) //delimitacao de andar

    //percorrendo cada andar da piramide
    for (i in 0..altura) {
        preencherAndarComTijolinhos(i)

    }
}

//preencher cada andar com os tijolinhos da piramide
fun preencherAndarComTijolinhos(andar: Int) {

    for (j in 0..andar) {
        print("#")
    }

    println()
}
