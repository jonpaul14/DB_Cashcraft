package com.example.cashcraft_app.room.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.cashcraft_app.Model.Gasto
import kotlinx.coroutines.flow.Flow

@Dao
interface GastoDatabaseDao {

    @Query("SELECT * FROM gasto")
    fun obtenerGasto():Flow<List<Gasto>>
    @Query("SELECT * FROM gasto WHERE id_gasto= :id_Gasto" )
    fun obtenerGasto (id_Gasto:Int):Flow<Gasto>
    @Insert
    suspend fun agregarGasto(gasto: Gasto)
    @Update
    suspend fun actualizarGasto(gasto: Gasto)
    @Delete
    suspend fun borrarGasto(gasto: Gasto)


}