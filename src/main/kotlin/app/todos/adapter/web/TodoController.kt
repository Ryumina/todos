package app.todos.adapter.web

import app.todos.adapter.web.dto.TodoRequestDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/todos")
class TodoController {

    @GetMapping("/")
    fun get(): String {
        return "hello todos!"
    }

    @PostMapping("/")
    fun create(@RequestBody todoRequest: TodoRequestDto): String {
        return "hello todos!"
    }
}
