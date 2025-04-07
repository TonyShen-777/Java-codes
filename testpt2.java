package applications;
import java.util.Scanner;
public class testpt2 {
	

	    public static void main(String[] args) {
	        Scanner yt = new Scanner(System.in);

	      
	        System.out.print("Enter a num: ");
	        int number = yt.nextInt();

	     
	        if (number > 0) {
	            System.out.println("The num is positive.");
	        } else if (number < 0) {
	            System.out.println("The num is negative.");
	        } else {
	            System.out.println("The num is zero.");
	        }

	        
	    }
	}

