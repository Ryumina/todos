package app.todos.adapter.web.dto

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class TodoRequestDtoTest {

    @Test
    fun `title값이 공백이면 예외 발생`() {
        assertThrows<IllegalArgumentException> {
            TodoRequestDto("    ")
        }
    }

    @Test
    fun `create`() {
        val requestDto = TodoRequestDto("create todo")

        assert("create todo" == requestDto.getTitle())
    }

    @Test
    fun `getTitle`() {
        val requestDto = TodoRequestDto("getTitle")

        assertEquals("getTitle", requestDto.getTitle())
    }
}