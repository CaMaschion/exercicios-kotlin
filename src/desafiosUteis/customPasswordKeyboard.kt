package desafiosUteis

fun main(){
    checkIfButtonPressSequenceIsValid(arrayOf(5,3,2,4,1))
}

fun checkIfButtonPressSequenceIsValid(buttonPressSequence: Array<Int>): Boolean {

    val keyboard = arrayOf(Pair(0,1), Pair(2,3), Pair(3,4), Pair(5,6), Pair(7,8), Pair(9,0))

    val password = "96482"

   //buttonPressSequence -> Array é a sequencia que representa meu password(senha)
   //keyboard -> representacao do teclado
   //password -> minha senha

    //para encontrar o primeiro número da senha digitado:
    //clico no keyboard, numero 9/indice 5 do keyboard (primeiro numero da password)
    //percorrer a sequencia (buttonPressSequence) para validar se a password está correta
    //validar se a posicao(buttonIndex) do keyboard e a posicao da password são iguais

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
