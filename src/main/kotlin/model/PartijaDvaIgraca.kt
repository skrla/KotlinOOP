package model

open class PartijaDvaIgraca(override var doKolikoSeIgra: Int, override val lokacija: Lokacija,
                            override val unosi: Igrac, override val mjesanja: List<Mjesanje>,
                            override val igraci: MutableList<Igrac?>
) : Partija() {

    override fun toString(): String {
        val rezultat= getRezultat()
        return "Partija DVA IGRAČA, igra gotova: " + isIgraGotova() + ", " + igraci[0] + ": " +
                rezultat.prvi +
                " | " + igraci[1] + ": " + rezultat.drugi
    }
}