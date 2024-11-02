package com.example.firsttest.sintaxis

fun main (){

    //CONDICIONAL IF

    val name:String = "Carlos"
    val rol:String = "admin"
    val edad:Int = 50

    if (edad > 50){
        println("$name es un adulto mayor")
    }else if(edad > 30) {
        println("$name es un adulto")
    }else if(edad >18){
        println("$name es un adulto joven")
    }else{
        println("$name es menor de edad")
    }

    //----

    if (rol == "admin"){
        println("Tienes acceso a todos los contenidos")
    }

    if(rol == "user"){
        println("Solo modo lectura")
    }




}