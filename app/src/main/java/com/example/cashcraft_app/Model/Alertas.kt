package com.example.cashcraft_app.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alerta")
data class Alerta(
    @PrimaryKey(autoGenerate = true)
    val id_Alerta:Int = 0,
    @ColumnInfo("tipo_Alert")
    val tipo_Alert: String,
    @ColumnInfo("fecha_Alert")
    val fecha_Alert: String,
    @ColumnInfo("mensaje_Alert")
    val mensaje_Alert: String
)