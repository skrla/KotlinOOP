package model

import java.util.*

open class MjesanjeDvaUnosa(val bodovaPrviUnos: Int, val bodovaDrugiUnos: Int, val zvanjePrviUnos: Int, val zvanjeDrugiUnos: Int) : Mjesanje() {

    override var stiglja: Boolean = false
    override var belot = false
    override var datumUnosa: Date? = null

    override fun getRezultat(): Rezultat? {
        return Rezultat(bodovaPrviUnos + zvanjePrviUnos, bodovaDrugiUnos + zvanjeDrugiUnos)
    }
}