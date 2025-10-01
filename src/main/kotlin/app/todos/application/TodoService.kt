package app.todos.application

import app.todos.adapter.web.dto.TodoRequestDto
import app.todos.domain.model.Todo
import app.todos.domain.port.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(
    private val todoRepository: TodoRepository
) {

    fun create(request: TodoRequestDto): Todo {
        return todoRepository.save(request.convertToTodo())
    }

}