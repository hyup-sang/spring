import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MyMathTest {
    private MyMath math = new MyMath();

    @Test
    void test() {
        int[] numbers = {1, 2, 3};
        MyMath math = new MyMath();
        int result = math.calculateSum(numbers);
        System.out.println(result);
//        int expectedResult = 6; // 성공
        int expectedResult = 5; // 실패
        assertEquals(expectedResult, result);
    }
}