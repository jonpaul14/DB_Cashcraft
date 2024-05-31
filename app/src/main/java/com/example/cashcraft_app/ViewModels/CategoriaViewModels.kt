package com.example.cashcraft_app.ViewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cashcraft_app.Model.Categoria
import com.example.cashcraft_app.State.CategoriasState
import com.example.cashcraft_app.room.Dao.CategoriaDatabaseDao
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class CategoriaViewModels (
    private val dao: CategoriaDatabaseDao

):ViewModel(){
    var state by mutableStateOf(CategoriasState())
        private set
    init {
        viewModelScope.launch {
            dao.obtenerCategoria().collectLatest {
                state = state.copy(
                    listaCategorias = it
                )
            }
        }
    }
    fun agregarCategoria(categoria: Categoria)=viewModelScope.launch {
        dao.agregarCategoria(categoria = categoria)
    }
    fun actualizarCategoria(categoria: Categoria)= viewModelScope.launch {
        dao.actualizarCategoria(categoria = categoria)
    }
    fun borrarCategoria(categoria: Categoria) = viewModelScope.launch {
        dao.borrarCategoria(categoria = categoria )
    }
}
