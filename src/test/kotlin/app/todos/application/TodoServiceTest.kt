package app.todos.application

import app.todos.adapter.web.dto.TodoRequestDto
import app.todos.domain.port.TodoRepository
import app.todos.adapter.repository.TodoRepositoryStub
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TodoServiceTest {
    private val todoRepository: TodoRepository = TodoRepositoryStub()
    private val todoService: TodoService = TodoService(todoRepository)

    @Test
    fun `create`() {
        val requestDto = TodoRequestDto("create todo")

        val todo = todoService.create(requestDto)

        assertTrue(todo.id == 1L)
        assertTrue(todo.title == "create todo")
    }
}