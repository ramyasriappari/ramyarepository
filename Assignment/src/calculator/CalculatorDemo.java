package calculator;
public class CalculatorDemo {
	static int powerInt(int num1,int num2)
	{
		return(int) Math.pow(num1, num2);
	}
    static double powerDouble(double num1,int num2)
    {
    	return Math.pow(num1, num2);
    }
	public static void main(String[] args) {
		System.out.println("the first method value is: "+CalculatorDemo.powerInt(5, 8));
		System.out.println("the second method value is:"+CalculatorDemo.powerDouble(4.5, 6));
	}

}
