package t2ucahurivanje

class Dokument(val sifra: Int, val brojDokumenta: String, val iznos: Double, izradio: Osoba?) {

    fun opisiMe(): String {
        return "$sifra - $brojDokumenta - $iznos"
    }

}