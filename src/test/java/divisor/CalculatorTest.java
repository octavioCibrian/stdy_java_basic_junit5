package divisor;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math operations in Calculator class")
class CalculatorTest {

    Calculator calculator;
    @BeforeAll
    static void setup() {
        System.out.println("Executing @BeforeAll method.");
    }

    @AfterAll
    static  void cleanup(){
        System.out.println("Executing @AfterAll method.");
    }

    @BeforeEach
    void beforeEachTestMethod() {
        calculator = new Calculator();
        System.out.println("Executing @BeforeEach method.");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Executing @AfterEach method");
    }

    @DisplayName("Test 4/2 = 2")
    @Test
    void testIntegerDivision_() {
        int result = calculator.integerDivision(10,2);
        assertEquals( 5, result, "10/2 didn't produce 2");
    }

//    @Disabled("Still working on it")
    @DisplayName("Division by Zero")
    @Test
    void testIntegerDivision_WhenItIsDividenByZero_ShouldThrowArithmeticException() {
//        fail("No implmented yet");
        int dividend = 4;
        int divisor = 0;

        String excpectedExpcetionMessage = "/ by zero";

        ArithmeticException actualException = assertThrows(ArithmeticException.class, ()-> calculator.integerDivision(dividend, divisor), "Division by zero should have thrown an Arithmetic exception.");

        assertEquals(excpectedExpcetionMessage, actualException.getMessage(), "Unexpected exception message");
    }


    @DisplayName("Test 33-1 = 32")
    @Test
    void integerSubtractionTest() {
        int minuend = 33;
        int subtrahend = 1;
        int expectedResult = 32;

        int actualResult = calculator.integerSubtraction(minuend,subtrahend);

        assertEquals(expectedResult, actualResult, ()-> minuend + "-"+subtrahend+" did not produce "+ expectedResult);
    }
}