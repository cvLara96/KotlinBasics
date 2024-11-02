package com.example.firsttest.sintaxis

//Esto seria una clase
//Entre parentesis podemos indicar los parametros que queremos que tenga
class Usuario (val name:String,
               val edad:Int,
               private val email:String,
               private val DNI:String,
               private val friends:MutableList<Usuario> = mutableListOf()
){

    //Creamos una funcion de la clase usuario, donde nos dara el email si somos el admin
    fun getEmail(role:String){

        if(role.equals("admin")){
            println(email)
        }

    }

    //Lo mismo para el dni
    fun getDNI(role:String){

        if(role.equals("admin")){
            println(DNI)
        }

    }

    //Creamos un metodo para agregar amigos a la lista
    fun addFriend(amigo:Usuario){
        friends.add(amigo)
    }

    //Creamos un metodo para mostrar los amigos
    fun showFriends(){

        println("Amigos de $name")

        friends.forEach { friend->
            println(friend.name)
        }

    }





}