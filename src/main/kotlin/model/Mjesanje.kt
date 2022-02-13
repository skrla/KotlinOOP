package model

import java.util.*

abstract class Mjesanje() : Entitet() {

    abstract var stiglja: Boolean
    abstract var belot: Boolean
    abstract var datumUnosa: Date?



    abstract fun getRezultat(): Rezultat?

}