package com.example.firsttest.sintaxis

fun main(){

    val listOfPokemon = mutableListOf<String>("Squirtle", "Charmander", "Bulbasaur")
    listOfPokemon.add("Pikachu")
    listOfPokemon.add("Gengar")
    listOfPokemon.add("Charmander") //Valor repetido

    println(listOfPokemon)

    //Para evitar valores duplicados podemos utilizar SETS

    //Set MUTABLE
    val setOfPokemon = mutableSetOf<String>("Squirtle", "Charmander", "Bulbasaur")
    setOfPokemon.add("Pikachu")
    setOfPokemon.add("Gengar")
    setOfPokemon.add("Charmander") //Valor repetido

    println(setOfPokemon) //Al imprimir, no muestra el valor repetido

    //Podemos hacer un set Inmutable con:
    //val setOfPokemon = setOf<String>("Squirtle", "Charmander", "Bulbasaur")

    //No podemos acceder a su contenido de forma ordenada:
    //println(setOfPokemon[0]) -> Esto no funcionaria

}