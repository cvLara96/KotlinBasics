package com.example.firsttest.sintaxis

fun main(){

    val persona1:Persona = Persona("Carlos", "Ventas", CivilStatus.Comprometed)
    val persona2:Persona= Persona("Pablo", "Palomino", CivilStatus.Married)

    //Podemos hacer lo mismo que con las clases normales, pero es mas sencilla
    println(persona1.name)
    println(persona2.name)

}