package com.example.cashcraft_app.ViewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cashcraft_app.Model.Categoria
import com.example.cashcraft_app.Model.Gasto
import com.example.cashcraft_app.State.GastoState
import com.example.cashcraft_app.room.Dao.GastoDatabaseDao
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class GastoViewModels(
    private val dao: GastoDatabaseDao

) : ViewModel(){
    var state by mutableStateOf(GastoState())
        private set
    init{
        viewModelScope.launch {
            dao.obtenerGasto().collectLatest {
                state = state.copy(
                    listaGastos = it
                )
            }
        }

        }
    fun agregarGasto(gasto: Gasto)=viewModelScope.launch {
        dao.agregarGasto(gasto = gasto)
    }
    fun actualizarGasto(gasto: Gasto)= viewModelScope.launch {
        dao.actualizarGasto(gasto = gasto)
    }
    fun borrarGasto(gasto: Gasto) = viewModelScope.launch {
        dao.borrarGasto(gasto = gasto )
    }
}