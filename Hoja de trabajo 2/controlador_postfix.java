import Stack;
import PostfixCalculator;
public class controlador_postfix {
	public static void main(String[] args) 
    {
        String operacion="3 10 5 + *";
        String[] strArr = operacion.split(" ");
        System.out.println(operacion);
        System.out.println(calacular(strArr));
    }
    public static int calacular (String[] lista)
    {
        Stack<Integer> operandos= new Stack<Integer>();
        PostfixCalculator computadorsica = new PostfixCalculator();
        for(String i : lista) 
        {
            if (i.trim().equals("")) 
            {
                continue;
            }
            switch (i)
            {
                case "+":
                case "-":
                case "*":
                case "/":
                    int a=operandos.pull(); 
                    int b=operandos.pull(); 
                    int ans=0;
                    switch (i)
                    {
                        case "+":
                            ans=computadorsica.suma(a,b);
                            break;
                        case "-":
                            ans=computadorsica.resta(a,b);
                            break;
                        case "*":
                            ans=computadorsica.multiplicacion(a,b);
                            break;
                        case "/":
                            ans=computadorsica.division(a,b);
                            break;
                        default:
                            break;
                    }
                operandos.push(ans);
                break;
                default:
                    operandos.push(Integer.parseInt(i));
                    break;
            }
            
        }
        return operandos.pull();
    }
}
