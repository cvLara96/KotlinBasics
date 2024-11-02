package com.example.firsttest.sintaxis

fun main(){

    var listOffriends = listOf("Monica", "Ross", "Rachel", "Jose", "Carlos")
    var index:Int = 0

    while(index < listOffriends.size){ //Mientras el indice sea menor que el numero de elementos de la lista ejecutara el while

        //Esto tambien sirve -> println(listOffriends[index])
        println(listOffriends.get(index))
        index++
        //Otra forma de sumar el valor de index
        //index+=1
        //index = index + 1

    }

}