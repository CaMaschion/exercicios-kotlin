package loianetraining.exerciciosLoianeAula25a27

class Lampada {

    var modelo: String? = null
    var tensao: String? = null
    var potencia: Int = 0
    var tipoLuz: String? = null
    var garantia: Int = 0
    var tipos: Array<String> = arrayOf()

    fun ligarLampada() {
        println("Lâmpada ligada")
    }

    fun desligarLampada() {
        println("Lâmpada desligada")
    }
    
}