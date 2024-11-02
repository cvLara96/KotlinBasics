package com.example.firsttest.sintaxis

fun main(){

    //Creamos un objeto de la clase Usuario
    val user:Usuario = Usuario("Carlos", 27, "cvl@tclm.es", "70251456K")
    val user1:Usuario = Usuario("Daniel", 30, "dvl@tclm.es", "70251456K")
    val user2:Usuario = Usuario("Pablo", 27, "ppg@tclm.es", "70251456K")
    val user3:Usuario = Usuario("Pilar", 25, "pgdt@tclm.es", "70251456K")

    //Podemos imprimir la informacion del objeto
    println(user.name)
    println(user.edad)

    user.getEmail("admin")
    user.getDNI("admin")

    //Añadimos amigos a user a traves del metodo de clase
    user.addFriend(user1)
    user.addFriend(user3)

    //Al resto de usuarios tambien podemos añadirle amigos
    user2.addFriend(user)
    user2.addFriend(user2)

    //podemos imprimir la lista de amigos de cada usuario
    user.showFriends()
    user2.showFriends()


}