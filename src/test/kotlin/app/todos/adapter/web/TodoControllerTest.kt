package app.todos.adapter.web

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
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

    @Test
    fun `todos post 요청시 title이 빈값이면 400 리턴`() {
        mockMvc.perform(
            post("/api/todos/")
                .content("{\"title\": \"  \"}")
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().is4xxClientError)
            .andDo(print())
    }

    @Test
    fun `todos post 요청시 title이 null이면 400 리턴`() {
        mockMvc.perform(
            post("/api/todos/")
                .content("{\"title\": null}")
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().is4xxClientError)
            .andDo(print())
    }

    @Test
    fun `todos post 요청시 hello todos!를 출력한다`() {
        mockMvc.perform(
            post("/api/todos/")
                .content("{\"title\": \"TDD 공부하기\"}")
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk)
            .andExpect(content().string("hello todos!"))
            .andDo(print())
    }

}
