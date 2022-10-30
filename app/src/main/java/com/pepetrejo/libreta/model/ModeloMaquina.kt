package com.pepetrejo.libreta.model

data class ModeloMaquina(
    var name: String = "",
    var bill50: String = "0",
    var bill20: String = "0",
    var bill10: String = "0",
    var cantidad50: String = (devuelve0(bill50).toInt() * 50).toString(),
    var cantidad20: String = (devuelve0(bill20).toInt() * 20).toString(),
    var cantidad10: String = (devuelve0(bill10).toInt() * 10).toString(),
    var total: String = (cantidad50.toInt() + cantidad20.toInt() + cantidad10.toInt()).toString()
)

fun devuelve0(numero:String) = numero.ifEmpty { "0" }