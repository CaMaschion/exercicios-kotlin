package exemplos

//um foreach é um for "melhorado". É muito usado com arrays/collections, para utilizar as
//funcionalidades (map, filter, sort..)

fun main() {
    for (i in 1..10){
        println("$i")
    }

    println("Outra maneira:")

    (1..10).forEach {
        println("$it")
    }
}

