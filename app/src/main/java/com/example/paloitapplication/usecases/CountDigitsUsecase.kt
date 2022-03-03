package com.example.paloitapplication.usecases

class CountDigitsUsecase {


    fun countDigits(s: String): Int {
        var result = 0
        for (i in '0'..'9') {
            val aux = countOccurrences(s, i.toChar())
            if (aux > result) {
                result = aux
            }
        }
        return result
    }

    fun countOccurrences(s: String, ch: Char): Int {
        return s.filter { it == ch }.count()
    }

}