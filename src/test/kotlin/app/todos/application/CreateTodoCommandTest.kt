package app.todos.application

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertNotNull
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CreateTodoCommandTest {

    @Test
    fun `create`() {
        val cmd = CreateTodoCommand("create test")

        assertNotNull(cmd)
        assertEquals(cmd.title, "create test")
    }

    @Test
    fun `equals와 hashCode가 값 기준으로 동작한다`() {
        val cmdA = CreateTodoCommand("test")
        val cmdB = CreateTodoCommand("test")

        assertTrue { cmdA == cmdB }
        assertEquals(cmdA.hashCode(), cmdB.hashCode())
    }

    @Test
    fun `copy로 복사할 수 있다`() {
        val cmdA = CreateTodoCommand("test")
        val cmdB = cmdA.copy()

        assertEquals("test", cmdB.title)
    }

}