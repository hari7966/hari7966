package HariKrishna;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " Shimakh Technology";
	      char[] carray = str.toCharArray();            //For separate value use this method
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[j] + " ");
	               break;
	            }
	         }
	      }
	   }
	

	}


