package com.example.firsttest.sintaxis

//Podemos crear funciones en otros ficheros y llamarlas desde el main

fun saludar(){

    //Aqui indicamos lo que necesitemos que haga la funcion
    val name = "Carlos Ventas Lara"

    println("Hola $name, bienvenido!")

}

fun despedir(){

    //Aqui indicamos lo que necesitemos que haga la funcion
    val name = "Carlos Ventas Lara"

    println("Adiós $name, buen viaje!")

}

//Funciones con parametros
fun saludarA(name:String, lastName: String){

    println("Hola $name $lastName, bienvenido!")

}

fun despedirA(name:String, lastName: String){

    println("Adiós $name $lastName, buen viaje!")
}