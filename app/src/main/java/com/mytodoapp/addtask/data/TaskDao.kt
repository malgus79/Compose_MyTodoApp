package com.mytodoapp.addtask.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Query("SELECT * from TaskEntity")
    fun getTasks(): Flow<List<TaskEntity>>

    @Insert  //(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addTask(item: TaskEntity)
}