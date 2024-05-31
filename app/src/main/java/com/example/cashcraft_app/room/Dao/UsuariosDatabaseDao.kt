package com.example.cashcraft_app.room.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.cashcraft_app.Model.Usuarios
import kotlinx.coroutines.flow.Flow

@Dao
interface UsuariosDatabaseDao{

    @Query("SELECT * FROM usuarios")
    fun obtenerUsuarios(): Flow<List<Usuarios>>

    @Query("SELECT * FROM usuarios WHERE id = :id")
    fun obtenerUsuarios(id:Int):Flow<Usuarios>

    @Insert
    suspend fun agregarUsuarios(usuarios: Usuarios)

    @Update
    suspend fun actualizarUsuarios(usuarios: Usuarios)

    @Delete
    suspend fun borrarUsuario(usuarios: Usuarios)

}
