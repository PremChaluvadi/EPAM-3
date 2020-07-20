package mavendesignprinciples;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter 2 inputs:");
    	int in1=s.nextInt();
    	int in2=s.nextInt();
    	Operations op=new Operations();
    	op.setData(in1,in2);
    	System.out.println("Enter the type of operation that you want to perform\n"
    			+ "1)Addition\n"
    			+ "2)Subtraction\n"
    			+ "3)Multiplication\n"
    			+ "4)Division");
    	System.out.println("Enter the number of operation that you want to perform,like "
    			+ "enter 1 for addition,etc");
    	int in3=s.nextInt();
    	switch(in3)
    	{
    		case 1:
    			op.add();
    			break;
    		case 2:
    			op.subtract();
    			break;
    		case 3:
    			op.multiply();
    			break;
    		case 4:
    			op.divide();
    			break;
    		default:
    			System.out.println("Choose an appropriate operation!!");
    	}
    }
}