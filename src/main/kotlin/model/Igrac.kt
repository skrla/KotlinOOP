package model

class Igrac(sifra: Int, val ime: String, val prezime: String, val urlSlike: String, val spol: Int) : Entitet(sifra) {
/*
    lateinit var ime: String
    lateinit var prezime: String
    lateinit var urlSlike: String
    var spol: Int = 0

    constructor(sifra: Int, ime: String, prezime: String, urlSlike: String, spol: Int) : this() {
        super.id = sifra
        this.ime = ime
        this.prezime = prezime
        this.urlSlike = urlSlike
        this.spol = spol
    }

 */
    override fun toString() = "$ime $prezime"

}