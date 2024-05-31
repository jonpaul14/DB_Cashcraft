package com.example.cashcraft_app.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tarjetas")
data class Tarjetas(
    @PrimaryKey(autoGenerate = true)
    val id_tarjeta:Int = 0,
    @ColumnInfo("nombre_banco")
    val nombre_banco: String,
    @ColumnInfo("numero_tarjeta")
    val numero_tarjeta: Int,
    @ColumnInfo("tipo_tarjeta")
    val tipo_tarjeta: String,
    @ColumnInfo("fecha_vencimiento")
    val fecha_vencimiento: String
)