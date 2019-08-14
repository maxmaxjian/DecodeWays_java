import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class SolutionTest(private val input: String, private val expected: Int) {

     private val soln = Solution1()

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun parameters() = listOf(
//            arrayOf("12", 2),
//            arrayOf("226", 3),
//            arrayOf("0", 0),
//            arrayOf("10", 1),
//            arrayOf("27", 1),
            arrayOf("611", 2)
        )
    }

    @Test
    fun testFunction() = assertEquals(expected, soln.numDecodings(input))
}