import org.junit.jupiter.api.*;

/**
 * 테스트는 순서대로 실행되지 않기 때문에
 * 테스트 전/후 작업이 필요한 경우 @Before, @After 같은 애너테이션을 사용함
 * Each는 테스트 케이스 마다,
 * All은 모든 테스트 케이스 전/후 한 번 실행
 * */
class MyBeforeAfterTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }

    @Test
    void test2() {
        System.out.println("test2");
    }

    @Test
    void test3() {
        System.out.println("test3");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }
}