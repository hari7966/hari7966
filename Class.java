package HariKrishna;

public class Class {
	
	    static int arr[] = { 1, 10, 20, 30 };
	 
	    // method for sum of elements in an array
	    static int sum()
	    {
	        int sum = 0; // initialize sum
	        int i;
	 
	        // Iterate through all elements and add them to sum
	        for (i = 0; i < arr.length; i++)
	            sum += arr[i];
	 
	        return sum;
	    }
	 
	    // Driver method
	    public static void main(String[] args)
	    {
	        System.out.println("Sum of given array is "
	                           + sum());
	    }
	}


