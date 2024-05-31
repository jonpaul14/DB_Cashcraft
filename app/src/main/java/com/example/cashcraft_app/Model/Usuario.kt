package com.example.cashcraft_app.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarios")
data class Usuarios(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    @ColumnInfo("nombre")
    val nombre: String,
    @ColumnInfo("usuario")
    val usuario: String,
    @ColumnInfo("email")
    val email: String
)