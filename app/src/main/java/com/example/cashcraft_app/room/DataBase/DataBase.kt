package com.example.cashcraft_app.room.DataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cashcraft_app.Model.Alerta
import com.example.cashcraft_app.Model.Categoria
import com.example.cashcraft_app.Model.Tarjetas
import com.example.cashcraft_app.Model.Usuarios
import com.example.cashcraft_app.room.Dao.CategoriaDatabaseDao
import com.example.cashcraft_app.room.Dao.GastoDatabaseDao
import com.example.cashcraft_app.room.Dao.TarjetasDatabaseDao
import com.example.cashcraft_app.room.Dao.UsuariosDatabaseDao

@Database(
    entities = [Usuarios::class,Gasto::class,Tarjetas::class
               ,Categoria::class,Alerta::class],
    version = 1,
    exportSchema = false

)
abstract class UsuariosDatabase:RoomDatabase(){
    abstract fun usariosDao():UsuariosDatabaseDao
}
abstract class GastoDatabase:RoomDatabase(){
    abstract fun gastosDao():GastoDatabaseDao
}
abstract class TarjetasDatabase:RoomDatabase(){
    abstract fun tarjetasDao():TarjetasDatabaseDao
}
abstract class CategoriasDatabase:RoomDatabase(){
    abstract fun CategoriasDao():CategoriaDatabaseDao
}
