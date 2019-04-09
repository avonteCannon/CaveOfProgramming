import calculator.Calc;
import org.junit.Assert;
import org.junit.Test;

public class CalcTest {



    @Test
    public void addTest(){
        //Given
        Calc calc = new Calc();
        int expected = 5;

        //When
        int actual = calc.add(2, 3);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractTest(){
        //Given
        Calc calc1 = new Calc();
        int answer = 7;

        //When
        int finalAnswer = calc1.subtract(14, 7);

        //Then
        Assert.assertEquals(answer, finalAnswer);
    }

    @Test
    public void squareTest(){
        //Given
        Calc calc2 = new Calc();
        int result = 4;

        //When
        int finalResult = calc2.square(2,2);

        //Then
        Assert.assertEquals(result, finalResult);
    }

    @Test
    public void multiplyTest(){
        //Given
        Calc calc3 = new Calc();
        double expected = 10.0;

        //When
        double finalExpected = calc3.multiply(2.0, 5.0);

        //Then
        Assert.assertEquals(expected, finalExpected, .0001);
    }
}
