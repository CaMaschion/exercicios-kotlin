package loianetraining.exerciciosLoianeAula24

//Escreva uma classe para representar uma lâmpada que está a venda em um supermercado.

class LampadaClass {

    var modelo: String? = null
    var tensao: String? = null
    var potencia: Int = 0
    var tipoLuz: String? = null
    var garantiaMeses: Int = 0
    var tipos: Array<String> = arrayOf()
}

class LampadaUm {
    init {
        val lampada  = LampadaClass()
        lampada.modelo = "A60"
        lampada.tensao = "Bivolt"
        lampada.potencia = 7
        lampada.tipoLuz = "Branca"
        lampada.garantiaMeses = 36
        lampada.tipos = arrayOf("Abajur", "Luminária", "Spot", "Teto")
    }
}
