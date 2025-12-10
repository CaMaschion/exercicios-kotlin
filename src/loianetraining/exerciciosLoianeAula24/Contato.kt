package loianetraining.exerciciosLoianeAula24

class Contato {

    var nome: String? = null
    var sobrenome: String? = null
    var numeroDeTelefone: String? = null
    var email: String? = null

}

class ContatoPrincipal {
    init {
        val contato = Contato()
        contato.nome = "João"
        contato.sobrenome = "Silva"
        contato.numeroDeTelefone = "11 99999-9999"
        contato.email = "joao@uol.com.br"
    }
}
