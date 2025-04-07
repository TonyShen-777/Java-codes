package applications;
import java.util.Scanner;
public class test {


	    public static void main(String[] args) {
	        Scanner op = new Scanner(System.in);

	       
	        System.out.print("Enter a num: ");
	        int number = op.nextInt();

	       
	        System.out.println("Multiplication table " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }	
		
	}
}
	
	
