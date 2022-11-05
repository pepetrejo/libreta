package com.pepetrejo.libreta


import com.pepetrejo.libreta.model.Maquina

fun getDatos(): List<Maquina> {
    return listOf(
        Maquina("Link", "10000", "10000"),
        Maquina("B-4", "10000", "10000"),
        Maquina("Power", "10000", "10000"),
        //Maquina("Impera", "10000", "10000"),
        //Maquina("Secret T1", "10000", "10000"),
    )
}



var listaMaquinas = getDatos()

fun suma(a: String = "", b: String = ""): String {

    val c: String?
    val d: String?

    c = a.ifEmpty { "0" }
    d = b.ifEmpty { "0" }


    return (c.toInt() + d.toInt()).toString()
}

fun primera(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun segunda(nombre: String): String {
    return nombre
}

fun total(funcion1: Int, funcion2: String): String {

    return funcion1.toString() + funcion2
}

