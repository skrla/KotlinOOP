import model.*
import pomocno.Json

class Start {
    private var partije: MutableList<Partija> = mutableListOf()
    private var igrac1: Igrac? = null
    private var igrac2: Igrac? = null
    private var igrac3: Igrac? = null
    private var igrac4: Igrac? = null
    private var lokacija: Lokacija? = null

    init {
        kreirajRucno()
        Json.toJsonFile("podaci.json", partije)
    }

    private fun kreirajRucno() {
        partije = ArrayList()
        igrac1 = kreirajIgraca1()
        igrac2 = kreirajIgraca2()
        igrac3 =
            Igrac(3, "Marija", "Zimska", "https://picsum.photos/200", Spol.ZENSKO.id)
        igrac4 =
            Igrac(4, "Anita", "Račman", "https://picsum.photos/200", Spol.ZENSKO.id)
        lokacija = kreirajLokaciju()
        kreirajPartijuDvaIgraca()
        kreirajPartijuTriIgraca()
        kreirajPartijuDvaPara()
    }

    private fun kreirajPartijuDvaPara() {
        val partija = PartijaDvaPara(501, lokacija!!, igrac1)
/*        partija.doKolikoSeIgra = 501
        partija.lokacija = lokacija!!
        partija.unosi = igrac1!!

 */
        val igraci: MutableList<Igrac?> = mutableListOf()
        igraci += igrac1
        igraci += (igrac2)
        igraci += (igrac3)
        igraci += (igrac4)
        partija.igraci = igraci
        println(partije.joinToString())
        partija.mjesanja = kreirajMjesanjaDvaPara()
        partije.add(partija)
    }

    private fun kreirajMjesanjaDvaPara(): List<Mjesanje> {
        val mjesanja: MutableList<Mjesanje> = ArrayList()
        var m = MjesanjeDvaUnosa()
        m.bodovaPrviUnos = 10
        m.bodovaDrugiUnos = 152
        m.zvanjePrviUnos = 0
        m.zvanjeDrugiUnos = 20
        mjesanja.add(m)
        m = MjesanjeDvaUnosa()
        m.bodovaPrviUnos = 152
        m.bodovaDrugiUnos = 10
        m.zvanjePrviUnos = 0
        m.zvanjeDrugiUnos = 20
        m.stiglja = true
        mjesanja.add(m)
        return mjesanja
    }

    private fun kreirajPartijuTriIgraca() {
        val partija = PartijaTriIgraca()
        partija.doKolikoSeIgra = 501
        partija.lokacija = lokacija!!
        partija.unosi = igrac1!!
        val igraci: MutableList<Igrac?> = mutableListOf()
        igraci.add(igrac1)
        igraci.add(igrac2)
        igraci.add(igrac3)
        partija.igraci = igraci
        partija.mjesanja = kreirajMjesanjaTriIgraca()
        partije.add(partija)
    }

    private fun kreirajMjesanjaTriIgraca(): List<Mjesanje> {
        val mjesanja: MutableList<Mjesanje> = mutableListOf()
        var m = MjesanjeTriUnosa()
        m.bodovaPrviUnos = 10
        m.bodovaDrugiUnos = 76
        m.zvanjePrviUnos = 0
        m.zvanjeDrugiUnos = 20
        m.bodovaTreciUnos = 76
        mjesanja.add(m)
        for (i in 0..4) {
            m = MjesanjeTriUnosa()
            m.bodovaPrviUnos = 10
            m.bodovaDrugiUnos = 76
            m.zvanjePrviUnos = 0
            m.zvanjeDrugiUnos = 20
            m.bodovaTreciUnos = 76
            mjesanja.add(m)
        }
        return mjesanja
    }

    private fun kreirajPartijuDvaIgraca() {
        val igraci: MutableList<Igrac?> = mutableListOf()
        igraci.add(igrac1)
        igraci.add(igrac2)
        val mjesanja = kreirajMjesanjaDvaIgraca()
        val partija = PartijaDvaIgraca(501, lokacija!!, igrac1!!, mjesanja, igraci)
        partije.add(partija)
    }

    private fun kreirajMjesanjaDvaIgraca(): List<Mjesanje> {
        val mjesanja: MutableList<Mjesanje> = ArrayList()
        var m = MjesanjeDvaUnosa(10, 152, 0, 20)

        mjesanja.add(m)
        m = MjesanjeDvaUnosa(152, 10, 0, 20)
        m.stiglja = true
        mjesanja.add(m)
        return mjesanja
    }

    private fun kreirajLokaciju() = Lokacija(id = 1,
        naziv = "Caffe Bar Peppermint",
        latitude = 45.5605825,
        longitude = 18.6098766)


    private fun kreirajIgraca1() = Igrac(1, "Tomislav", "Jakopec", "https://picsum.photos/200", Spol.MUSKO.id)


    private fun kreirajIgraca2() = Igrac(2, "Marijan", "Zidar", "https://picsum.photos/200", Spol.MUSKO.id)

}

fun main() {
    Start()
}