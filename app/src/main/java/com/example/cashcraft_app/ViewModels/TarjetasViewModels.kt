package com.example.cashcraft_app.ViewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cashcraft_app.Model.Categoria
import com.example.cashcraft_app.Model.Tarjetas
import com.example.cashcraft_app.State.TarjetasState
import com.example.cashcraft_app.room.Dao.TarjetasDatabaseDao
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class TarjetasViewModels (
    private val dao:TarjetasDatabaseDao
): ViewModel(){
    var state by mutableStateOf(TarjetasState())
        private set
    init {
        viewModelScope.launch {
            dao.obtenerTarjetas().collectLatest {
                state = state.copy(
                    listaTarejetas = it
                )
            }
        }
    }
    fun agregarTarjetas(tarjetas: Tarjetas)=viewModelScope.launch {
        dao.agregarTarjetas(tarjetas = tarjetas)
    }
    fun actualizarTarjetas(tarjetas: Tarjetas)= viewModelScope.launch {
        dao.actualizarTarjetas(tarjetas = tarjetas)
    }
    fun borrarTarjetas(tarjetas: Tarjetas) = viewModelScope.launch {
        dao.borrarTarjetas(tarjetas = tarjetas )
    }
}