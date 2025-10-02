package app.todos.adapter.repository

import app.todos.domain.model.Todo
import app.todos.domain.port.TodoRepository

class TodoRepositoryStub : TodoRepository {
    override fun save(todo: Todo): Todo {
        return Todo(
            id = 1L,
            title = todo.title,
            done = todo.done,
            createdAt = todo.createdAt,
            updatedAt = todo.updatedAt
        )
    }

}