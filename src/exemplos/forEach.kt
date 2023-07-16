package exemplos

fun main() {
    for (i in 1..10){
        println("$i")
    }

    println("Outra maneira:")

    (1..10).forEach {
        println("$it")
    }
}

