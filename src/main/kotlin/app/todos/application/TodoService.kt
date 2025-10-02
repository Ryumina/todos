package app.todos.application

import app.todos.domain.model.Todo
import app.todos.domain.port.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(
    private val todoRepository: TodoRepository
) {

    fun create(cmd: CreateTodoCommand): Todo {
        return todoRepository.save(Todo(title = cmd.title))
    }

}