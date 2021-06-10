package exercicios2

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    println("Digite uma letra (M - Masculino, F - Feminino)")

    val letra = scan.next()

    if (letra.equals("M", ignoreCase = true)){
        println("Masculino")
    } else if (letra.equals("F", ignoreCase = true)) {
        println("Feminino")
    } else {
        println("Letra inválida")
    }
}

/*public class Exer03 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in)

        System.out.println("Entre com uma letra (F ou M)");
        String input = scan.next();

        if(input.equalsIgnoreCase("f")){
            System.out.println("F-Feminino");
        } else if (input.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
} */