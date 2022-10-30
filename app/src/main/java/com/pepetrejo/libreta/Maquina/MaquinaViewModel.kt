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

    private val _cantidad50 = MutableLiveData<String>(infinity.cantidad50)
    val cantidad50: LiveData<String> = _cantidad50

    private val _bill20 = MutableLiveData<String>(infinity.bill20)
    val bill20: LiveData<String> = _bill20

    private val _cantidad20 = MutableLiveData<String>(infinity.cantidad20)
    val cantidad20: LiveData<String> = _cantidad20

    private val _bill10 = MutableLiveData<String>(infinity.bill10)
    val bill10: LiveData<String> = _bill10

    private val _cantidad10 = MutableLiveData<String>(infinity.cantidad10)
    val cantidad10: LiveData<String> = _cantidad10

    private val _totalInfinity = MutableLiveData<String>(infinity.total)
    val totalInfinity: LiveData<String> = _totalInfinity


    fun onDatosChanged(bill50: String, bill20: String, bill10:String, total:String) {
        _bill50.value = bill50
        _bill20.value = bill20
        _bill10.value = bill10
        _totalInfinity.value = total

    }


}