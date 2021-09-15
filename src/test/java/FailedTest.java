import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class FailedTest {
    int a = 16;
    int b = 2;
    @BeforeMethod
    void setUp(){}
    @AfterMethod
    void tearDown(){}

    @DataProvider(name = "calcTest")
    Object[][] calcDataProvider() {
        return new Object[][]{
                {4, 2, 2},
                {9, 3, 6},
        };
    }
    @Test(dataProvider = "calcTest")
    public void testCalculatorRemove(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.minus(a, b);
        assertEquals(result, expectedResult);
    }
    @BeforeMethod
    void setUp2(){}
    @AfterMethod
    void tearDown2(){}
    @DataProvider(name = "calcTest2")
    Object[][] calcDataProvider2() {
        return new Object[][]{

                {54, 2, 27},
                {90, 0, 27},
        };
    }
    @Test(dataProvider = "calcTest2")
    @Ignore
    public void testCalculatorDivide(int a, int b, int expectedResult) {
        Calculator calculator2 = new Calculator();

        int result2 = calculator2.divide(a, b);
        assertEquals(result2, expectedResult);
    }
}
