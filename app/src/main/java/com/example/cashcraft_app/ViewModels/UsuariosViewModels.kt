package com.example.cashcraft_app.ViewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cashcraft_app.Model.Tarjetas
import com.example.cashcraft_app.Model.Usuarios
import com.example.cashcraft_app.State.UsuarioState
import com.example.cashcraft_app.room.Dao.UsuariosDatabaseDao
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class UsuariosViewModels(
    private val dao:UsuariosDatabaseDao
): ViewModel(){
    var state by mutableStateOf(UsuarioState())
        private set
    init {
        viewModelScope.launch {
            dao.obtenerUsuarios().collectLatest {
                state = state.copy(
                    listaUsuarios = it
                )
            }
        }
    }
    fun agregarUsuario(usuarios: Usuarios)=viewModelScope.launch {
        dao.agregarUsuarios(usuarios = usuarios)
    }
    fun actualizarTarjetas(usuarios: Usuarios)= viewModelScope.launch {
        dao.actualizarUsuarios(usuarios = usuarios)
    }
    fun borrarTarjetas(usuarios: Usuarios) = viewModelScope.launch {
        dao.borrarUsuario(usuarios = usuarios )
    }
}

