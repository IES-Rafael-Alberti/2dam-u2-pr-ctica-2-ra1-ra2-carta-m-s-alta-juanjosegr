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
    }


}