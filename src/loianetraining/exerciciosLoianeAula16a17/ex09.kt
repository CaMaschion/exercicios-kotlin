package loianetraining.exerciciosLoianeAula16a17

//Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50;

fun main() {
    exNove()
}

fun exNove(){

    for (i in 1..50){
        if (i %2 != 0)
            println(i)
    }

}