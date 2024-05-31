package com.example.cashcraft_app.State

import com.example.cashcraft_app.Model.Gasto

data class GastoState(
    val listaGastos: List<Gasto> = emptyList()
)
