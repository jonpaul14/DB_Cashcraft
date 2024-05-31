package com.example.cashcraft_app.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categoria")
data class Categoria(
    @PrimaryKey(autoGenerate = true)
    val id_Categoria:Int = 0,
    @ColumnInfo("nombre_Cat")
    val nombre_Cat: String,
    @ColumnInfo("descripcion_Cat")
    val descripcion_Cat: String,
    @ColumnInfo("presupuesto_Cat")
    val presupuesto_Cat: Float
)