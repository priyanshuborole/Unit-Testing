package com.app.unittesting

object RegistrationIUtil {
    /**
     * input is not valid if ..
     * username and password is empty
     * username already exist
     * confirm pass does not match password
     * pass contain less than 2 digit
     */

    private val existingUser = listOf("Amit","Viraj")

    fun validateRegistrationInput(
        username : String,
        password : String,
        confirmedPassword : String
    ) : Boolean{
        if (username.isEmpty() || password.isEmpty()){
            return false
        }
        if (username in existingUser){
            return false
        }

        if ( password != confirmedPassword){
            return false
        }
        if (password.count{it.isDigit()}<2){
            return false
        }
        return true
    }

}