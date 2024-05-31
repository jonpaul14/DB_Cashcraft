package com.example.cashcraft_app.room.Dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.cashcraft_app.Model.Categoria
import kotlinx.coroutines.flow.Flow

interface CategoriaDatabaseDao {
    @Query("SELECT * FROM categoria")
    fun obtenerCategoria(): Flow<List<Categoria>>

    @Query("SELECT * FROM usuarios WHERE id = :id")
    fun obtenerUsuarios(id:Int): Flow<Categoria>

    @Insert
    suspend fun agregarCategoria(categoria: Categoria)

    @Update
    suspend fun actualizarCategoria(categoria: Categoria)

    @Delete
    suspend fun borrarCategoria(categoria: Categoria)
}