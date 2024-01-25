package com.example.prueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.prueba.ui.theme.PruebaTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        main()
        }

    fun sumaNumPares(lista: List<Int>): Int {
        return lista.filter { it % 2 == 0 }.sum()
    }

    fun listaAleatoria(cantidad:Int,rango:IntRange):List<Int>{
        return List(cantidad){
            Random.nextInt(rango.start,rango.endInclusive+1)
        }
    }

    fun main() {
        val cantidad=15
        val rango=1..20
        val numeros = listaAleatoria(cantidad,rango)
        val sumaPar = sumaNumPares(numeros)
        println("La lista de numeros aleatoria es: $numeros" )
        println("La suma de los números pares es: $sumaPar")
    }
}

