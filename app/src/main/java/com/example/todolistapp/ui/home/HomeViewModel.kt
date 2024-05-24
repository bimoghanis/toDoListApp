package com.example.todolistapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todolistapp.data.ToDoItem

class HomeViewModel : ViewModel() {

    private val _todoList = MutableLiveData<List<ToDoItem>>().apply {
        value = listOf(
            ToDoItem(1, "Buy groceries", "Milk, Bread, Cheese"),
            ToDoItem(2, "Finish project", "Complete the project by end of the week"),
            // Add more to-do items here
        )
    }
    val todoList: LiveData<List<ToDoItem>> = _todoList
}
