package com.example.cashcraft_app.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "gasto")
data class Gasto(
    @PrimaryKey(autoGenerate = true)
    val id_gasto:Int = 0,
    @ColumnInfo("fecha_gasto")
    val fecha: String,
    @ColumnInfo("descripcion_gasto")
    val descripcion_gasto: String,
    @ColumnInfo("presupuesto_gasto")
    val monto_gasto: Float
)