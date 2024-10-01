package exemplos

fun main() {

    val destinos = listOf<Destino>(
        Destino(1, "São Paulo", "A cidade que nunca para"),
        Destino(2, "Rio de Janeiro", "Cidade maravilhosa"),
        Destino(3, "Curitiba", "Cidade modelo")
    )
    val cardViews = destinos.map { it.toCardView() }
    cardViews.forEach { println(it) }

}

fun Destino.toCardView() = CardView(id, title, description)

data class Destino(
    val id: Int,
    val title: String,
    val description: String
)

data class CardView(
    val id: Int,
    val title: String,
    val description: String
)