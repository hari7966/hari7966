package HariKrishna;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "Hari";
		String second = "Krishna";
		System.out.println(first);
		System.out.println(second);
		System.out.println("-------");
		 String Rev = ReverseString(first);
		 System.out.println(Rev);
		 String Rev1 = ReverseString(second);
		 System.out.println(Rev1);
	}
		static String ReverseString(String s) {                   
		return new StringBuilder(s).reverse().toString();

	}

}
