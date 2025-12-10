package loianetraining.exerciciosLoianeAula24
//Escreve uma classe "livro" que represente os dados básicos de um livro, sem se preocupar com a sua finalidade

class LivroClass {

    var preco : Int = 0
    var tema : String? = null
    var titulo : String? = null
    var numeroDePaginas : Int = 0
    var anoDeLancamento : Int = 0
    var autor : String? = null
    var empresta: Boolean = false
    var quantidadeLivros : Int = 0
}

class NovoLivro() {
    init {
        val novoLivro = LivroClass()
        novoLivro.preco = 50
        novoLivro.tema = "Terror"
        novoLivro.titulo = "O Exorcista"
        novoLivro.numeroDePaginas = 300
        novoLivro.anoDeLancamento = 1973
        novoLivro.autor = "William Peter Blatty"
        novoLivro.empresta = true
        novoLivro.quantidadeLivros = 10
    }
}
