package exerciciosLoianeAula16a17

import java.util.*

//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual
// ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir informaçōes


fun main() {
    senha()
}

fun senha() {

    //ler nome de usuário
    val scanNome = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira seu nome:")
    val nome = scanNome.next()

    //ler senha
    val scanSenha = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira sua senha:")
    var senha = scanSenha.next()

    //se a senha for igual ao nome do usuário
    //faça: mostrar mensagem de erro e pedir para criar uma diferente
    //enquanto: nao criar uma diferente, o programa volta a pedir que crie

    do {

        var senhaValida = false
        if (senha.equals(nome, ignoreCase = true)) {
            println("Senha inválida. Crie uma senha diferente do seu nome")
            senha = scanSenha.next()
        } else {
            senhaValida = true
            println("senha valida")
        }

    } while (!senhaValida)
}
