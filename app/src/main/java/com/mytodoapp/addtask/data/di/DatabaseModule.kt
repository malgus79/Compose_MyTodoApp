package com.mytodoapp.addtask.data.di

import android.content.Context
import androidx.room.Room
import com.mytodoapp.addtask.data.MyTodoDatabase
import com.mytodoapp.addtask.data.TaskDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun provideTaskDao(myTodoDatabase: MyTodoDatabase): TaskDao {
        return myTodoDatabase.taskDao()
    }

    @Provides
    @Singleton
    fun provideMyTodoDatabase(@ApplicationContext appContext: Context): MyTodoDatabase {
        return Room.databaseBuilder(appContext, MyTodoDatabase::class.java, "TaskDatabase").build()
    }
}