package com.example.paloitapplication.usecases

import org.junit.Assert
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class CountDigitsUsecaseTest {

    lateinit var  SUT: CountDigitsUsecase

    @Before
    fun setUp() {
        SUT = CountDigitsUsecase()
    }

    @Test
    internal fun countDigits_emptyInput_zeroResult() {
        val result = SUT.countDigits("")
        assertEquals(0, result)
    }

    @Test
    internal fun countDigits_sameDigit111_correctResult() {
        val result = SUT.countDigits("111")
        assertEquals(3, result)
    }

    @Test
    internal fun countDigits_randomInput_correctResult() {
        val result = SUT.countDigits("1110000")
        assertEquals(4, result)
    }

    @Test
    internal fun countDigits_complexInput_correctResult() {
        val result = SUT.countDigits("11100002225556667777777")
        assertEquals(7, result)
    }

    @Test
    internal fun countDigits_twoDigitsWihtTheSameOcurrences_correctResult() {
        val result = SUT.countDigits("999666")
        assertEquals(3, result)
    }
}