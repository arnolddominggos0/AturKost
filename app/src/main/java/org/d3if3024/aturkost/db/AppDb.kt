package org.d3if3024.aturkost.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [PenghuniEntity::class], version = 1, exportSchema = false)
abstract class AppDb : RoomDatabase() {
    abstract val dao: PenghuniDao
    companion object {
        @Volatile
        private var INSTANCE: AppDb? = null
        fun getInstance(context: Context): AppDb {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDb::class.java,
                        "app.db"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}

