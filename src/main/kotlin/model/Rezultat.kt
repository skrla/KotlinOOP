package model

class Rezultat(val prvi: Int, val drugi: Int, val treci: Int = 0) {

    fun isPocetak(): Boolean {
        return prvi == 0 && drugi == 0 && treci == 0
    }

}