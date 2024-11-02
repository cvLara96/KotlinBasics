package com.example.firsttest.sintaxis

fun main(){

    /*
    FUNCIONES LAMBDA:
        - Son funciones que pueden estar llamadas dentro de un parametro
    */

    //Llamamos a la funcion, pasandole por parametro el nombre y la funcion
    myLambda("Carlos") {fullName->
        //La funcion que mandaremos sera un println
        println("Hola $fullName")
    }

    myLambdaReturn(4,5){num1, num2 ->
        num1 + num2
    }


}

//EJEMPLO PROPIO

/*Entre los parametros de la funcion, solicitaremos un String y una funcion:
*   - Unit significa que no regresa nada, es como un void
*   - La funcion que pasamos por parametro, en este caso queremos que reciba un String por parametro (fullName:String)
* */

fun myLambda(name:String, saludar:(fullName:String)-> Unit){

    println("Estoy entrando a la funcion lambda")

    //Ahora podemos llamar a la funcion que tiene por parametro, pasandole por parametro el name que recibe myLambda
    saludar("$name Ventas")

    println("Estoy saliendo de la funcion lambda")

}

/*
* EJEMPLO DE FUNCION LAMBDA QUE DEVUELVE UN INT
* */

fun myLambdaReturn(num1:Int, num2: Int, sumar:(num1:Int, num2:Int)->Int){

    //Almacenamos el Int que devuelve la funcion sumar en una variable
    val resultado = sumar(num1, num2)

    println(resultado)


}