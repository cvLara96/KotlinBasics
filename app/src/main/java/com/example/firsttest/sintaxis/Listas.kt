package com.example.firsttest.sintaxis

fun main(){

    //lista de string
    var amigos = listOf<String>("Pablo", "Daniel", "Pilar")

    //lista de int
    var edades = listOf<Int>(20,23,30)

    println(amigos) //Imprime todos los elementos de la lista
    println(amigos[2])//Imprime el elemento almacenado en la posicion 2, en este caso Pilar
    println(amigos.size)//Imprime el numero de datos almacenados
    println(amigos.first())//Imprime el primer valor de la lista
    println(amigos.last())//Imprime el ultimo valor de la lista
    println(amigos.isEmpty())//Devuelve true o false dependiendo de si la lista esta vacia

    // GET

    println(amigos.get(0)) //Hace lo mismo que amigos[0]

    // SET, las listas son INMUTABLES, de manera que para poder cambiar los valores de una lista

        //println(amigos.set(0, "Juan")) -> Esto no funcionaria

    //Para poder modificar valores de una lista debemos declararla como mutableListOf

    var amigos_nuevos = mutableListOf<String>("Pablo", "Daniel", "Pilar")

    amigos_nuevos.set(0, "Hector") //Ahora si modificara el valor de la posicion que le indiquemos
    println(amigos_nuevos.get(0))

    //A las listas mutables tambien podemos añadirle mas valores
    amigos_nuevos.add("Pablo")
    println(amigos_nuevos)


}