package com.mytodoapp.addtask.ui.model

data class TaskModel(
    val id: Long = System.currentTimeMillis(),
    val task: String,
    var selected: Boolean = false
)