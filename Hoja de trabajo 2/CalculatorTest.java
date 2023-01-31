import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import junit.framework.TestCase;
public class CalculatorTest extends TestCase {
    PostfixCalculator calculadora;
    /**
     * Se crea el constructor de prueba para poder hacer los tests
     */
    private void prueba()
    {
        calculadora = new PostfixCalculator();
    }
    /**
     * se hace el metodo test suma para poder comprobar que el metodo funcione bien
     */
    public void testSuma()
    {
        prueba();
        calculadora.suma(7,8);
        assertEquals(15,calculadora.suma(7,8));
    }
    /**
     * Se hace el metodo test isOperator para poder comprobar que el metodo funcione bien
     */
    public void testIsOperator()
    {
        prueba();
        calculadora.isOperator("-");
        assertEquals(true, calculadora.isOperator("-"));
    }
    /**
     * Se hace el metodo testDivision para poder comprobar que el metodo funcione bien
     */
    public void testDivision()
    {
        prueba();
        calculadora.division(10,2);
        assertEquals(5, calculadora.division(10, 2));
    }
}
