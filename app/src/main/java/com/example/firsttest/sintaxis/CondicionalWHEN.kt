package com.example.firsttest.sintaxis

fun main(){

    //CONDICIONAL WHEN

    val name:String = "Carlos"
    val edad:Int = 28
    val role:String = "admin"

    when{
        edad > 60 -> println("$name es un anciano")
        edad > 30 -> println("$name es un adulto")
        edad > 18 -> println("$name es un adulto joven")
        else -> println("$name es menor de edad")
    }

    when(role){
        "admin"-> println("Acceso total")
        "user" -> println("Acceso limitado")
        else -> println("Acceso denegado")
    }

}