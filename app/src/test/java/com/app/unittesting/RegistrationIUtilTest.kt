package com.app.unittesting


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationIUtilTest{

    @Test
    fun `empty username returns false` (){
        val result = RegistrationIUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }
    @Test
    fun `valid username and correctly repeated password returns true` (){
        val result = RegistrationIUtil.validateRegistrationInput(
            "Priyanshu",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }
    @Test
    fun `username already exist returns false` (){
        val result = RegistrationIUtil.validateRegistrationInput(
            "Amit",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }
    @Test
    fun `pass contain less than 2 digit returns false` (){
        val result = RegistrationIUtil.validateRegistrationInput(
            "Amit",
            "abc2",
            "abc2"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `confirm pass does not match with pass returns false` (){
        val result = RegistrationIUtil.validateRegistrationInput(
            "Amit",
            "123",
            "12345"
        )
        assertThat(result).isFalse()
    }

}