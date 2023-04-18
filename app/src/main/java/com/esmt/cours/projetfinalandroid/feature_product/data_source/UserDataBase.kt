package com.esmt.cours.projetandroidjetpackcompose.feature_product.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.esmt.cours.projetandroidjetpackcompose.feature_product.domain.model.User

@Database(entities = [User::class], version = 1)
abstract class UserDataBase : RoomDatabase() {

    abstract  val userDao: UserDao
    //abstract fun userDao(): UserDao

   /* companion object {
        @Volatile
        private var INSTANCE: UserDataBase? = null

        fun getDatabase(context: Context): UserDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDataBase::class.java,
                    "user_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }*/
}
