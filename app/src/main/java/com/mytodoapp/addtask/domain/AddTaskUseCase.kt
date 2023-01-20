package com.mytodoapp.addtask.domain

import com.mytodoapp.addtask.data.TaskRepository
import com.mytodoapp.addtask.ui.model.TaskModel
import javax.inject.Inject

class AddTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.add(taskModel)
    }

}