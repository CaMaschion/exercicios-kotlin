package loianetraining.exerciciosLoianeAula25a27

class ContaCorrente {

    var numeroDaConta: String? = null
    var saldo: Double = 0.0
    var status: String? = null
    var limite: Double = 0.0

    fun saque() {
        if (saldo > 0 && saldo > limite) {
            println("Saque realizado com sucesso")
        } else {
            println("Saldo insuficiente")
        }
    }

    fun deposito(){
        if (numeroDaConta != null){
            println("Depósito realizado com sucesso")
        } else {
            println("Número da conta não informado")
        }
    }

    fun consultarSaldo(){
        if (numeroDaConta != null){
            println("Saldo da conta: $saldo")
        } else {
            println("Número da conta não informado")
        }
    }

    fun verificarUsoDoChequeEspecial() {
        if(saldo < 0) {
            println("Cheque especial utilizado")
        } else {
            println("Cheque especial não utilizado")
        }
    }
}