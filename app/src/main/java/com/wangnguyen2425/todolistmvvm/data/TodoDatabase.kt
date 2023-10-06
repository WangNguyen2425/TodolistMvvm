package com.wangnguyen2425.todolistmvvm.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.wangnguyen2425.todolistmvvm.data.Todo
import com.wangnguyen2425.todolistmvvm.data.TodoDao

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase: RoomDatabase() {

    abstract val dao: TodoDao
}