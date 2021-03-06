package model

/**
 * @author Matija SkrletoviÄ‡
 **/

class MjesanjeTriUnosa(
    bodovaPrviUnos: Int,
    bodovaDrugiUnos: Int,
    zvanjePrviUnos: Int,
    zvanjeDrugiUnos: Int,
    val bodovaTreciUnos: Int,
    val zvanjeTreciUnos: Int = 0
) : MjesanjeDvaUnosa(
    bodovaPrviUnos, bodovaDrugiUnos, zvanjePrviUnos, zvanjeDrugiUnos
) {

    override fun getRezultat(): Rezultat {
        val treciRezultat = super.getRezultat()
        treciRezultat!!.treci = bodovaTreciUnos + zvanjeTreciUnos
        return treciRezultat
    }
}