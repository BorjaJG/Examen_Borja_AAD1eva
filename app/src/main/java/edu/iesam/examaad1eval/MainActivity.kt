package edu.iesam.examaad1eval

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.iesam.examaad1eval.features.data.Ex1DataRepository
import edu.iesam.examaad1eval.features.data.local.LocalEx1DataRepository
import edu.iesam.examaad1eval.features.data.remote.RemoteEx1DataRepository
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        executeExercise1()
        executeExercise2()
    }

    private fun executeExercise1(){
        val ex1DataRepository = Ex1DataRepository(LocalEx1DataRepository(), RemoteEx1DataRepository())
        ex1DataRepository.getUser()
        ex1DataRepository.getItems()
        ex1DataRepository.getServices()
    }

    @OptIn(DelicateCoroutinesApi::class)
    private fun executeExercise2(){
        //Ejecutar el ejercicio 2 desde aquí llamando al Ex2DataRepository directamente
        GlobalScope.launch {
            //llamar a Room
        }
    }
}