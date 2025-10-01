package app.todos.adapter.web.dto

import app.todos.domain.model.Todo

class TodoRequestDto(private val title: String) {

    init {
        title.trim().also {
            require(it.isNotEmpty()) { "[title] : 필수 항목을 입력해주세요" }
        }
    }

    fun getTitle(): String {
        return title
    }

    fun convertToTodo(): Todo {
        return Todo(title = title)
    }
}
