import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MyMathTest {
    private MyMath math = new MyMath();

    @Test
    void calcSum_threeMemberArray() {
        assertEquals(0, math.calculateSum(new int[]{}));
    }

    @Test
    void calcSum_ZeroLehngthArray() {
        assertEquals(6, math.calculateSum(new int[]{1, 2, 3}));
    }
}