package model

class PartijaDvaPara : Partija() {

    override fun toString(): String {
        val rezultat = getRezultat()
        return "Partija DVA PARA, igra gotova: " + isIgraGotova() + ", " +
                igraci[0] + " i " + igraci[1] + ": " + rezultat.prvi + " | " +
                igraci[2] + " i " + igraci[3] + ": " + rezultat.drugi
    }
}