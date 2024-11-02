package com.example.firsttest.sintaxis

fun main(){

    //Una sealed class es una clase que nos permite tener elementos del mismo tipo

    val persona1:Persona = Persona("Carlos", "Ventas", CivilStatus.Comprometed)
    val persona2:Persona = Persona("Pablo", "Palomino", CivilStatus.Married)
    val persona3:Persona = Persona("Daniel", "Palomino", CivilStatus.Married)

    println(persona1.civilStatus)

}