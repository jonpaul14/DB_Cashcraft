package com.example.cashcraft_app.room.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.cashcraft_app.Model.Tarjetas
import kotlinx.coroutines.flow.Flow

@Dao
interface TarjetasDatabaseDao {

    @Query("SELECT * FROM tarjetas")
    fun obtenerTarjetas():Flow<List<Tarjetas>>

    @Query("SELECT * FROM tarjetas WHERE id_tarjeta = :id_tarjeta" )
    fun obtenerTarjetas(id_tarjeta:Int):Flow<Tarjetas>

    @Insert
    suspend fun agregarTarjetas(tarjetas: Tarjetas)

    @Update
    suspend fun actualizarTarjetas(tarjetas: Tarjetas)

    @Delete
    suspend fun borrarTarjetas(tarjetas: Tarjetas)
}