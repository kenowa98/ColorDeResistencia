package com.kenowa.codigoderesistencias

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bandera1 = false
        var bandera2 = false
        var bandera3 = false
        var bandera4 = false

        var num1 = ""
        var num2 = ""
        var num3 = ""
        var num4 = ""

        // Configurar las características de vista del spinner 1
        val spinner1: Spinner = findViewById(R.id.sp_color1)
        ArrayAdapter.createFromResource(
            this,
            R.array.lista_color1,
            R.layout.spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
            spinner1.adapter = adapter
        }
        // Cambiar el color de imageView según el spinner 1
        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                pos: Int,
                id: Long
            ) {
                val item = parent.getItemAtPosition(pos)
                val color: ImageView = findViewById(R.id.iv_color1)
                showColor(color, item as String)
                num1 = colores1(item)
                bandera1 = spinner1.selectedItemPosition != 0
                if (bandera1 && bandera2 && bandera3 && bandera4){
                    resultado(num1, num2, num3, num4, tv_valor)
                } else {
                    tv_valor.text = ""
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        // Configurar las características de vista del spinner 2
        val spinner2: Spinner = findViewById(R.id.sp_color2)
        ArrayAdapter.createFromResource(
            this,
            R.array.lista_color2,
            R.layout.spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
            spinner2.adapter = adapter
        }
        // Cambiar el color de imageView según el spinner 2
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                pos: Int,
                id: Long
            ) {
                val item = parent.getItemAtPosition(pos)
                val color: ImageView = findViewById(R.id.iv_color2)
                showColor(color, item as String)
                num2 = colores1(item)
                bandera2 = spinner2.selectedItemPosition != 0
                if (bandera1 && bandera2 && bandera3 && bandera4){
                    resultado(num1, num2, num3, num4, tv_valor)
                } else {
                    tv_valor.text = ""
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        // Configurar las características de vista del spinner 3
        val spinner3: Spinner = findViewById(R.id.sp_color3)
        ArrayAdapter.createFromResource(
            this,
            R.array.lista_color3,
            R.layout.spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
            spinner3.adapter = adapter
        }
        // Cambiar el color de imageView según el spinner 3
        spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                pos: Int,
                id: Long
            ) {
                val item = parent.getItemAtPosition(pos)
                val color: ImageView = findViewById(R.id.iv_color3)
                showColor(color, item as String)
                num3 = colores2(item)
                bandera3 = spinner3.selectedItemPosition != 0
                if (bandera1 && bandera2 && bandera3 && bandera4){
                    resultado(num1, num2, num3, num4, tv_valor)
                } else {
                    tv_valor.text = ""
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        // Configurar las características de vista del spinner 4
        val spinner4: Spinner = findViewById(R.id.sp_color4)
        ArrayAdapter.createFromResource(
            this,
            R.array.lista_color4,
            R.layout.spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
            spinner4.adapter = adapter
        }
        // Cambiar el color de imageView según el spinner 4
        spinner4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                pos: Int,
                id: Long
            ) {
                val item = parent.getItemAtPosition(pos)
                val color: ImageView = findViewById(R.id.iv_color4)
                showColor(color, item as String)
                num4 = colores3(item)
                bandera4 = spinner4.selectedItemPosition != 0
                if (bandera1 && bandera2 && bandera3 && bandera4){
                    resultado(num1, num2, num3, num4, tv_valor)
                } else {
                    tv_valor.text = ""
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

    }

    private fun showColor(iv: ImageView, item: String) {
        when (item) {
            "Negro" -> { iv.setImageResource(R.drawable.negro) }
            "Marrón" -> { iv.setImageResource(R.drawable.marron) }
            "Rojo" -> { iv.setImageResource(R.drawable.rojo) }
            "Naranja" -> { iv.setImageResource(R.drawable.naranja) }
            "Amarillo" -> { iv.setImageResource(R.drawable.amarillo) }
            "Verde" -> { iv.setImageResource(R.drawable.verde) }
            "Azul" -> { iv.setImageResource(R.drawable.azul) }
            "Violeta" -> { iv.setImageResource(R.drawable.morado) }
            "Gris" -> { iv.setImageResource(R.drawable.gris) }
            "Blanco" -> { iv.setImageResource(R.drawable.blanco) }
            "Dorado" -> { iv.setImageResource(R.drawable.dorado) }
            "Plata" -> { iv.setImageResource(R.drawable.plata) }
            else -> { iv.setImageResource(0) }
        }
    }

    private fun colores1(item: String) : String {
        return when (item) {
            "Negro" -> { "0" }
            "Marrón" -> { "1" }
            "Rojo" -> { "2" }
            "Naranja" -> { "3" }
            "Amarillo" -> { "4" }
            "Verde" -> { "5" }
            "Azul" -> { "6" }
            "Violeta" -> { "7" }
            "Gris" -> { "8" }
            "Blanco" -> { "9" }
            else -> { "" }
        }
    }

    private fun colores2(item: String) : String {
        return when (item) {
            "Negro" -> { "sΩ" }
            "Marrón" -> { "1sΩ" }
            "Rojo" -> { "kΩ" }
            "Naranja" -> { "1kΩ" }
            "Amarillo" -> { "2kΩ" }
            "Verde" -> { "MΩ" }
            "Azul" -> { "1MΩ" }
            "Violeta" -> { "2MΩ" }
            "Gris" -> {"GΩ"}
            "Blanco" -> {"1GΩ"}
            "Dorado" -> { "0.1" }
            "Plata" -> { "0.01" }
            else -> { "" }
        }
    }

    private fun colores3(item: String) : String {
        return when (item) {
            "Marrón" -> { " ±1%" }
            "Rojo" -> { " ±2%" }
            "Verde" -> { " ±0.5%" }
            "Azul" -> { " ±0.25%" }
            "Violeta" -> { " ±0.1%" }
            "Gris" -> { " ±0.05%" }
            "Dorado" -> { " ±5%" }
            "Plata" -> { " ±10%" }
            else -> { "" }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun resultado(st1: String, st2: String, st3: String, st4: String, tv: TextView) {
        if (st3 == "0.1") {
            if (st2 != "0") { tv.text = "$st1,$st2"+"Ω$st4" }
            else { tv.text = st1 +"Ω$st4" }
        } else if (st3 == "0.01"){
            if (st2 != "0") { tv.text = "0,$st1$st2"+"Ω$st4" }
            else { tv.text = "0,$st1"+"Ω$st4" }
        } else if (st3.contains("sΩ")) {
            if (st3 == "sΩ") { tv.text = "$st1$st2" + "Ω$st4" }
            else { tv.text = "$st1$st2" + "0Ω$st4" }
        } else if (st3.contains("kΩ")) {
            when (st3) {
                "kΩ" -> {
                    if (st2 != "0") { tv.text = "$st1,$st2"+"kΩ$st4" }
                    else { tv.text = st1+"kΩ$st4" }
                }
                "1kΩ" -> {
                    if (st2 != "0") { tv.text = "$st1$st2"+"kΩ$st4" }
                    else { tv.text = st1+"0kΩ$st4" }
                }
                else -> { tv.text = "$st1$st2"+"0kΩ$st4" }
            }
        } else if (st3.contains("MΩ")) {
            when (st3) {
                "MΩ" -> {
                    if (st2 != "0") { tv.text = "$st1,$st2"+"MΩ$st4" }
                    else { tv.text = st1+"MΩ$st4" }
                }
                "1MΩ" -> {
                    if (st2 != "0") { tv.text = "$st1$st2"+"MΩ$st4" }
                    else { tv.text = st1+"0MΩ$st4" }
                }
                else -> { tv.text = "$st1$st2"+"0MΩ$st4" }
            }
        } else {
            when (st3) {
                "GΩ" -> {
                    if (st2 != "0") { tv.text = "$st1,$st2"+"GΩ$st4" }
                    else { tv.text = st1+"GΩ$st4" }
                }
                else -> { tv.text = "$st1$st2"+"GΩ$st4" }
            }
        }
    }
}