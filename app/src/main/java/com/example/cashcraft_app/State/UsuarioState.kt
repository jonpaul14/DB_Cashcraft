package com.example.cashcraft_app.State

import com.example.cashcraft_app.Model.Usuarios

data class UsuarioState(
    val listaUsuarios: List<Usuarios> = emptyList()
)
