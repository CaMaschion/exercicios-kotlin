package exemplos

fun main(){
    checkIfButtonPressSequenceIsValid(arrayOf(5,3,2,4,1))
}

fun checkIfButtonPressSequenceIsValid(buttonPressSequence: Array<Int>): Boolean {

    val keyboard = arrayOf(Pair(0,1), Pair(2,3), Pair(4,5), Pair(6,7), Pair(8,9))

    val password = "96482"

    for (buttonIndex in buttonPressSequence){
        if (keyboard[buttonIndex].first.toString() == password[0].toString() ||
            keyboard[buttonIndex].second.toString() == password[0].toString()) {

            println("Botao certo")
        } else {
            println("Botao errado")
        }
    }
    return true
}
