package com.pepetrejo.libreta.Clases

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pepetrejo.libreta.listaMaquinas

class ClasesViewModel : ViewModel() {

        private val _nombre = MutableLiveData<String>(listaMaquinas[1].name)
        val nombre: LiveData<String> = _nombre

        private val _ticket = MutableLiveData<String>(listaMaquinas[1].ticket)
        val ticket: LiveData<String> = _ticket

        private val _recuperado = MutableLiveData<String>(listaMaquinas[1].recuperado)
        val recuperado: LiveData<String> = _recuperado

        private val _pendiente = MutableLiveData<String>()
        val pendiente: LiveData<String> = _pendiente

        fun onDatosChanged(num1: String, num2: String) {
            _ticket.value = num1
            _recuperado.value = num2
            _pendiente.value = restar(num1, num2)
        }

        fun restar(a: String = "", b: String = ""): String {

            val c: String?
            val d: String?

            c = a.ifEmpty { "0" }
            d = b.ifEmpty { "0" }


            return (c.toInt() - d.toInt()).toString()
        }

    }
