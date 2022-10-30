package com.pepetrejo.libreta.suma

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

    class NumViewModel : ViewModel() {
        private val _num1 = MutableLiveData<String>()
        val num1: LiveData<String> = _num1

        private val _num2 = MutableLiveData<String>()
        val num2: LiveData<String> = _num2

        private val _sumatorio = MutableLiveData<String>()
        val sumatorio: LiveData<String> = _sumatorio

        fun onNumChanged(num1: String, num2: String) {
            _num1.value = num1
            _num2.value = num2
            _sumatorio.value = sumar(num1, num2)
        }

        fun sumar(a: String = "", b: String = ""): String {

            val c: String?
            val d: String?

            c = a.ifEmpty { "0" }
            d = b.ifEmpty { "0" }


            return (c.toInt() + d.toInt()).toString()
        }

    }


