package com.example.firsttest.sintaxis

fun main(){

    //MAPS -> Son objetos clave-valor
    val mapOfPokemons = mutableMapOf("pikachu" to "electric", "charmander" to "fire")

    //podemos hacerlo inmutable declarandolo como mapOf()

    //podemos consultar por la clave y nos dara el valor
    println(mapOfPokemons["pikachu"])

    //para añadir valores tenemos dos formas
    mapOfPokemons.put("squirtle", "water")
    mapOfPokemons["bulbasaur"] = "planta"

    //para imprimir todos los calores
    println(mapOfPokemons)

    //no podremos acceder a elementos de forma ordenada, tendremos que acceder a ellos a traves de su clave

}