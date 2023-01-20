package com.mytodoapp.addtask.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TaskEntity::class], version = 1)
abstract class MyTodoDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}