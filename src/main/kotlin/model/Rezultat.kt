package model

class Rezultat(var prvi: Int, var drugi: Int, var treci: Int = 0) {

    fun isPocetak(): Boolean {
        return prvi == 0 && drugi == 0 && treci == 0
    }


}