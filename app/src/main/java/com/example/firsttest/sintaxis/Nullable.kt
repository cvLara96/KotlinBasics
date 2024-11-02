package com.example.firsttest.sintaxis

fun main(){

    val name:String = "Carlos"

    //Para poder arreglarlo, podemos añadir un ? al final del tipo
    //indicando que es un String, pero que acepta valores nulos:
    var curso:String? = null

    //Para controlar que al imprimir por pantalla no muestre null
    //podemos utilizar un if
    if(curso == null){
        println("$name no esta estudiando")
    }else{
        println("$name esta estudiando $curso")
    }

    //En el caso de los numeros es distinto
    var num1 : Int? = 10

    //Para solucionar esto, tendremos que indicarle que num1 tiene un valor, utilizando !!
    var resultado = num1!! + 5 //con !! indicamos a kotlin que estamos seguros de que la variable no es nula



}