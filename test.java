package applications;
import java.util.Scanner;
public class test {


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	       
	        System.out.print("Enter a number: ");
	        int number = input.nextInt();

	       
	        System.out.println("Multiplication table for " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }	
		
	}
}
	
	
