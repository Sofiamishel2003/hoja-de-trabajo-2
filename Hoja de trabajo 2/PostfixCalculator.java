/**
 * @author sofia.velasquez, Julio garcia salas y Jose Joaquin campos
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PostfixCalculator<T> implements IPostfixCalculator<T> {

	private ArrayList<T> data;
	private int resultado;
    @Override
	public boolean isOneItem(IStack operandos)
    {
        return operandos.count() == 1;
    }
    public int suma(int a, int b)
    {
        return a+b;
    }
    public int resta(int a, int b)
    {
        return a-b;
    }
    
    public int multiplicacion(int a, int b)
    {
        return a*b;
    }
    public int division(int a, int b)
    {
        return a/b;
    }
    public boolean isOperator(String item)
    {
        return item.equals("+") || item.equals("-") || item.equals("/") || item.equals("*");
    }
    
  //  java.util.ArrayList<String> getItems(String _expresion);
    public ArrayList<String> getItems(String _expresion) 
    {
        String[] separado = _expresion.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(separado));
        return list;
    }
}