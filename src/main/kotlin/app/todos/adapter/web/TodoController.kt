package app.todos.adapter.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/todos")
class TodoController {

    @GetMapping("/")
    fun get(): String {
        return "hello todos!"
    }
}
