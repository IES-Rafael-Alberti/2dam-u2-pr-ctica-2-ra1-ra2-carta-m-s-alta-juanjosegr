package com.example.cartas.Screens


enum class Palos {
    CORAZONES, DIAMANTES, TREBOLES, PICAS
}

enum class Naipes {
    AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, JOTA, REINA, REY

}
class Baraja {

    companion object{
        var listaCartas = arrayListOf<Carta>()
        fun crearBaraja(){
            var idDrawable = 1
            for (palo in Palos.values()){
                for (numero in Naipes.values()){
                    val cartaNueva = Carta(numero, palo,numero.ordinal + 1, numero.ordinal + 1, idDrawable)
                    if (numero.name == "AS") cartaNueva.puntosMax = 11
                    listaCartas.add(cartaNueva)
                    idDrawable++
                }
            }
        }
    }


    fun barajar(){
        listaCartas.shuffle()
    }

    fun dameCarta(){
        listaCartas.removeLast()
    }
}