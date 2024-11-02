package com.example.firsttest.sintaxis

fun main(){


    val friends = listOf("Carlos", "Pablo", "Daniel")

    //Utilizando for each
    /*
    it representa a cada valor de la lista cuando pasa el bucle

    friends.forEach {
        println(it)

    }*/

    friends.forEach {name ->
        println(name)
    }


}