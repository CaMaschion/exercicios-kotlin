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
//
//    //ler as infos
//    //validar se o é nome maior que 3 caracteres
//    val scanNome = Scanner(System.`in`).useLocale(Locale.US)
//    println("Insira seu nome:")
//    var nome = scanNome.next()
//
//    //validar: enquanto o nome tiver menos que 3 caracteres o programa continua pedindo a info
//
//    var nomeMaior = false
//    do {
//        if (nome.length >= 3) {
//            nomeMaior = true
//            println("O nome $nome tem mais de 3 caracteres")
//        } else {
//            println("Nome inválido, insira um nome com mais de 3 caracteres")
//            nome = scanNome.next()
//
//        }
//    } while (!nomeMaior)
//
//
//    //validar: idade entre 0 e 150
//    val scanIdade = Scanner(System.`in`).useLocale(Locale.US)
//    println("Insira sua idade:")
//    var idade = scanIdade.nextInt()
//
//    do {
//        var idadeValida = false
//
//        if (idade in 0..150) {
//            idadeValida = true
//            println("Idade $idade válida.")
//        } else {
//            println("Idade inválida. Tente novamente")
//            idade = scanIdade.nextInt()
//        }
//    } while (!idadeValida)
//
//
//    //Validar: Salário maior que zero
//    val scanSalario = Scanner(System.`in`).useLocale(Locale.US)
//    println("Insira seu salário:")
//    var salario = scanSalario.nextDouble()
//
//    do {
//        var salarioValido = false
//        if (salario > 0) {
//            salarioValido = true
//            println("Salário $salario válido")
//
//        } else {
//            println("Insira novo salário")
//            salario = scanSalario.nextDouble()
//        }
//    } while (!salarioValido)
//
//
//    //Validar: Sexo feminino ou masculino
//    val scanSexo = Scanner(System.`in`).useLocale(Locale.US)
//    println("Insira seu sexo:")
//    var sexo = scanSexo.next()
//
//    do {
//
//        var sexoValido = false
//
//        if (sexo.equals("M", ignoreCase = true)) {
//            sexoValido = true
//            println("Masculino")
//        } else if (sexo.equals("F", ignoreCase = true)) {
//            sexoValido = true
//            println("Feminino")
//        } else {
//            println("sexo inválido, digite novamente")
//            sexo = scanSexo.next()
//        }
//    } while (!sexoValido)


    //Validar: Estado civil - 's', 'c', 'v', 'd'
    val scanCivil = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira a primeira letra do seu estado civil:")
    var estadoCivil = scanCivil.next()

    do {

        var estadoCivilValido = false

        if (estadoCivil.equals("s", ignoreCase = true)) {
            estadoCivilValido = true
            println("solteira")
        } else if (estadoCivil.equals("c", ignoreCase = true)) {
            estadoCivilValido = true
            println("casada")
        } else if (estadoCivil.equals("v", ignoreCase = true)) {
            estadoCivilValido = true
            println("viúva")
        } else if (estadoCivil.equals("d", ignoreCase = true)) {
            estadoCivilValido = true
            println("divorciada")
        } else {
            println("estado civil inválido, digite novamente")
            estadoCivil = scanCivil.next()
        }

    } while (!estadoCivilValido)

}
