package com.pepetrejo.libreta.Maquina

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pepetrejo.libreta.modeloMaquina.infinity


class MaquinaViewModel : ViewModel() {


    private val _nombre = MutableLiveData<String>(infinity.name)
    val nombre: LiveData<String> = _nombre

    private val _bill50 = MutableLiveData<String>(infinity.bill50)
    val bill50: LiveData<String> = _bill50
    private val _cantidad50 = MutableLiveData<String>(infinity.cantidad50())
    val cantidad50: LiveData<String> = _cantidad50

    private val _bill20 = MutableLiveData<String>(infinity.bill20)
    val bill20: LiveData<String> = _bill20
    private val _cantidad20 = MutableLiveData<String>(infinity.cantidad20())
    val cantidad20: LiveData<String> = _cantidad20

    private val _bill10 = MutableLiveData<String>(infinity.bill10)
    val bill10: LiveData<String> = _bill10
    private val _cantidad10 = MutableLiveData<String>(infinity.cantidad10())
    val cantidad10: LiveData<String> = _cantidad10

    private val _bill5 = MutableLiveData<String>(infinity.bill5)
    val bill5: LiveData<String> = _bill5
    private val _cantidad5 = MutableLiveData<String>(infinity.cantidad5())
    val cantidad5: LiveData<String> = _cantidad5

    private val _mon2 = MutableLiveData<String>(infinity.mon2)
    val mon2: LiveData<String> = _mon2
    private val _cantidad2 = MutableLiveData<String>(infinity.cantidad2())
    val cantidad2: LiveData<String> = _cantidad2

    private val _mon1 = MutableLiveData<String>(infinity.mon1)
    val mon1: LiveData<String> = _mon1
    private val _cantidad1 = MutableLiveData<String>(infinity.cantidad1())
    val cantidad1: LiveData<String> = _cantidad1

    private val _mon050 = MutableLiveData<String>(infinity.mon050)
    val mon050: LiveData<String> = _mon050
    private val _cantidad050 = MutableLiveData<String>(infinity.cantidad050())
    val cantidad050: LiveData<String> = _cantidad050

    private val _mon020 = MutableLiveData<String>(infinity.mon020)
    val mon020: LiveData<String> = _mon020
    private val _cantidad020 = MutableLiveData<String>(infinity.cantidad020())
    val cantidad020: LiveData<String> = _cantidad020

    private val _mon010 = MutableLiveData<String>(infinity.mon010)
    val mon010: LiveData<String> = _mon010
    private val _cantidad010 = MutableLiveData<String>(infinity.cantidad010())
    val cantidad010: LiveData<String> = _cantidad010

    private val _totalInfinity = MutableLiveData<String>(infinity.total())
    val totalInfinity: LiveData<String> = _totalInfinity



    fun onDatosChanged(bill50: String,
                       bill20: String,
                       bill10:String,
                       bill5:String,
                       mon2:String,
                       mon1:String,
                       mon050:String,
                       mon020:String,
                       mon010:String,
                       total:String) {
        _bill50.value = bill50
        _bill20.value = bill20
        _bill10.value = bill10
        _bill5.value = bill5
        _mon2.value = mon2
        _mon1.value = mon1
        _mon050.value = mon050
        _mon020.value = mon020
        _mon010.value = mon010
        _totalInfinity.value = total

        infinity.bill50 = bill50
        infinity.bill20 = bill20
        infinity.bill10 = bill10
        infinity.bill5 = bill5
        infinity.mon2 = mon2
        infinity.mon1 = mon1
        infinity.mon050 = mon050
        infinity.mon020 = mon020
        infinity.mon010 = mon010
        _totalInfinity.value = infinity.total()
        _cantidad50.value = infinity.cantidad50()
        _cantidad20.value = infinity.cantidad20()
        _cantidad10.value = infinity.cantidad10()
        _cantidad5.value = infinity.cantidad5()
        _cantidad2.value = infinity.cantidad2()
        _cantidad1.value = infinity.cantidad1()
        _cantidad050.value = infinity.cantidad050()
        _cantidad020.value = infinity.cantidad020()
        _cantidad010.value = infinity.cantidad010()// Esto funciona



        Log.i("pepe", " ${_bill50.value}, ${infinity.bill50}, ${_bill20.value}, ${infinity.bill20}, ${infinity.total()}")

    }


}
