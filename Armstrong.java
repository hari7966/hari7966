package HariKrishna;
import java.util.Scanner;
public class Armstrong {
	Scanner input = new Scanner(System.in);
    system.out.println("the number");
	int number = Integer.parseInt(input.next());
	int amstrongNumber = number;
	int num = number;
	int added = 0;
	int count = 0;
	while (num>0) {
		count = count +1;
		num= num/10;
	}
	while(number>0) {
		int rem = number%10;
		added = (int) (added + (Math.pow(rem , count)));
		number = number/10;
	}
	if(amstrongNumber == added) {
		System.out.println(amstrongNumber + " is an amstrong number");
	}else {
		System.out.println(amstrongNumber + " is not an amstrong number");
	}
}
}


