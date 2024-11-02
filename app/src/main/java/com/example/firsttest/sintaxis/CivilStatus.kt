package com.example.firsttest.sintaxis

sealed class CivilStatus{
    object Single:CivilStatus()
    object Married:CivilStatus()
    object Comprometed:CivilStatus()
    object Divorced:CivilStatus()

}
