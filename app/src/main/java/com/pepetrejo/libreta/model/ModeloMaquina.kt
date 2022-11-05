package com.pepetrejo.libreta.model

import java.text.NumberFormat
import java.util.*

data class ModeloMaquina(
    var name: String = "",
    var bill50: String = "",
    var bill20: String = "",
    var bill10: String = "",
    var bill5: String = "",
    var mon2: String = "",
    var mon1: String = "",
    var mon050: String = "",
    var mon020: String = "",
    var mon010: String = ""

) {
    fun cantidad50() = formato((devuelve0(bill50).toDouble() * 50))
    fun cantidad20() = formato((devuelve0(bill20).toDouble() * 20))
    fun cantidad10() = formato((devuelve0(bill10).toDouble() * 10))
    fun cantidad5() = formato((devuelve0(bill5).toDouble() * 5))
    fun cantidad2() = formato((devuelve0(mon2).toDouble() * 2))
    fun cantidad1() = formato((devuelve0(mon1).toDouble() * 1))
    fun cantidad050() = formato((devuelve0(mon050).toDouble() * 0.5))
    fun cantidad020() = formato((devuelve0(mon020).toDouble() * 0.2))
    fun cantidad010() = formato((devuelve0(mon010).toDouble() * 0.1))
    fun total() = formato(
        (       (devuelve0(bill50).toDouble() * 50) +
                (devuelve0(bill20).toDouble() * 20) +
                (devuelve0(bill10).toDouble() * 10) +
                (devuelve0(bill5).toDouble() * 5) +
                (devuelve0(mon2).toDouble() * 2) +
                (devuelve0(mon1).toDouble() * 1) +
                (devuelve0(mon050).toDouble() * 0.5) +
                (devuelve0(mon020).toDouble() * 0.2) +
                (devuelve0(mon010).toDouble() * 0.1)
                )
    )

}

fun devuelve01(numero: String) = numero.ifBlank { "0" }

fun devuelve0(numero: String): String {
    if(numero.isNullOrEmpty()) {
         return "0"
    }else{
        return numero
    }
}





fun formato(number: Double) = NumberFormat.getCurrencyInstance(Locale("ES", "es")).format(number)
