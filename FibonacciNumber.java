package HariKrishna;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 500, firstTerm = 0, secondTerm = 1;
        
	    System.out.println("Fibonacci Series Upto " + n +   ": ");
	    
	    while (firstTerm <= n) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	    }
	  }
	

	}


