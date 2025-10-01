package app.todos.domain.port

import app.todos.domain.model.Todo

interface TodoRepository {
    fun save(todo: Todo): Todo
}