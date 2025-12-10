package grokking

/**
**O Problema:** Escreva uma função recursiva `fatorial(n: Int)` que calcule o fatorial de um número inteiro positivo $n$.
$$n! = n \times (n-1) \times (n-2) \times \dots \times 1$$

* **Caso Base de Sucesso (Parada):** Qual é o fatorial de 1? (Ou 0?)
* **Caso Recursivo (Redução):** Como você expressa $n!$ em termos de $(n-1)!$?
**/

fun main() {
    println(factorial(4))
}

fun factorial(n: Int): Int {
    if (n <= 1) {
        return 1
    }

    return n * factorial((n-1))

}