package app.todos.adapter.web

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest
class TodoControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `todos get 요청시 hello todos!를 출력한다`() {
        mockMvc.perform(get("/api/todos/"))
            .andExpect(status().isOk)
            .andExpect(content().string("hello todos!"))
            .andDo(print())
    }

}
