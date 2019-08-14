import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTestJava {
    private String input;
    private int expected;
    private SolutionJava soln = new Solution2();

    public SolutionTestJava (String input, int output) {
        this.input = input;
        this.expected = output;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {"12", 2},
                {"226", 3},
                {"0", 0},
                {"27", 1},
                {"230", 0}
        });
    }

    @Test
    public void test() {
        assertEquals(expected, soln.numDecodings(input));
    }
}