package exerciciosLoianeAula16a17

import java.util.*

//faça um programa que leia e valide as seguintes informaçōes:
//a. Nome: maior que 3 caracteres
//b. Idade: entre 0 e 150
//c. Salário: maior que zero
//d. Sexo: 'f' ou 'm'
//e. Estado Civil: 's', 'c', 'v', 'd'

fun main() {
    validador()
}

fun validador() {

    //ler as infos
    val scan = Scanner(System.`in`).useLocale(Locale.US)

    var infoValida = false
    var nome: String
    var idade: Int
    var salario: Double
    var sexo: String
    var estadoCivil: String

    do {

        println("Insira seu nome:")
        nome = scan.next()

        if (nome.length >= 3) {
            infoValida = true
        } else {
            println("Nome inválido, insira um nome com mais de 3 caracteres")

        }
    } while (!infoValida)

    infoValida = false

    //validar: idade entre 0 e 150
    do {

        println("Insira a idade:")
        idade = scan.nextInt()

        if (idade in 0..150) {
            infoValida = true
        } else {
            println("Idade inválida. Tente novamente")
        }
    } while (!infoValida)

    infoValida = false
    //Validar: Salário maior que zero
    do {

        println("Insira seu salário:")
        salario = scan.nextDouble()

        if (salario > 0) {
            infoValida = true
        } else {
            println("Insira novo salário maior que zero")

        }
    } while (!infoValida)


    //Validar: Sexo feminino ou masculino
    infoValida = false
    do {
        println("Insira seu sexo:")
        sexo = scan.next()

        if (sexo.equals("M", ignoreCase = true) || sexo.equals("F", ignoreCase = true)) {
            infoValida = true
        } else {
            println("sexo inválido, digite novamente")

        }
    } while (!infoValida)

    //Validar: Estado civil - 's', 'c', 'v', 'd'

    infoValida = false
    do {

        println("Insira a primeira letra do seu estado civil:")
        estadoCivil = scan.next()

        if (estadoCivil.equals("s", ignoreCase = true) ||
            estadoCivil.equals("c", ignoreCase = true) ||
            estadoCivil.equals("v", ignoreCase = true) ||
            estadoCivil.equals("d", ignoreCase = true)
        ) {
            infoValida = true
        } else {
            println("estado civil precisa ser 's', 'c', 'v' ou 'd' ")
        }

    } while (!infoValida)

    println("Nome: $nome")
    println("Idade: $idade")
    println("Salário: $salario")
    println("Sexo: $sexo")
    println("Estado Civil: $estadoCivil")

}
