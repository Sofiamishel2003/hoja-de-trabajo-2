import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import junit.framework.TestCase;
public class CalculatorTest extends TestCase {
    PostfixCalculator calculadora;
    private void prueba()
    {
        calculadora = new PostfixCalculator();
    }
    public void testSuma()
    {
        prueba();
        calculadora.suma(7,8);
        assertEquals(15,calculadora.suma(7,8));
    }
    public void testIsOperator()
    {
        prueba();
        calculadora.isOperator("-");
        assertEquals(true, calculadora.isOperator("-"));
    }
    public void testDivision()
    {
        prueba();
        calculadora.division(10,2);
        assertEquals(5, calculadora.division(10, 2));
    }
}
