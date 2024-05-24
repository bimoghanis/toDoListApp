package com.example.todolistapp.data

import androidx.room.Insert

interface ToDoItemDao {
    @Insert
    fun insert(toDoItem:ToDoItem)

}