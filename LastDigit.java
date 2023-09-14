package HariKrishna;
import java.util.Scanner;

public class LastDigit {
	
	    public static void main (String[] args)
	    {
	         Scanner Sc = new Scanner(System.in);
	         System.out.println("Enter the number: ");
	         int num = Sc.nextInt();
	         
	         int lastDigit = num%10;
	         
	         System.out.println("The last Digit of the Number is "+lastDigit);
	    }
	}


