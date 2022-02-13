package model

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
    /*
        var bodovaTreciUnos = 0

        var zvanjeTreciUnos = 0
    */
    override fun getRezultat(): Rezultat {
        val treciRezultat = super.getRezultat()
        treciRezultat!!.treci = bodovaTreciUnos + zvanjeTreciUnos
        return treciRezultat
    }
}