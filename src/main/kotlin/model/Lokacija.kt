package model

class Lokacija(id: Int, val longitude: Double, latitude: Double, val naziv: String) : Entitet(id) {
/*
    var longitude: Double = 0.0
    var latitude: Double = 0.0
    lateinit var naziv: String

    constructor(longitude: Double, latitude: Double, naziv: String) : this() {
        this.longitude = longitude
        this.latitude = latitude
        this.naziv = naziv
    }
*/
}