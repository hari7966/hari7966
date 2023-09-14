package HariKrishna;

public class ifconditon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// If statement
		int num = 100;
		if(num<=100) {                                     // Condition
			System.out.println("value of num is:"+num );    // statement
		}
		
		// if else  using Operators
		int maths=70 , science=80, english=40, french=35;   // Condition
		if (maths>=60 && science>=50 && (english>=35 || french>=30)) {  //statement
			System.out.println("Student are promoted");
		}
		else {
			System.out.println("Student not are promoted");	
		
		}
		// Nested if using Operators
		int computer = 70;
		int commers = 80;
		int java = 60;        
																
		if (computer>=40 && commers>40 && java>=50  ) {        //condition
			System.out.println("candidates has been qualified");      //statement
		if(computer>=77 && (commers>75 || java>=80  )) {                 //Condition
			System.out.println("candidates will got distinction");    // Statement
		}
		}
		
		// if else if statement Using data types
	
		int date = 5;		
		if (date<=5) {
			System.out.println("Hurry salary got credited");
		}
		else if(date>5 && date<=15 ) {
			System.out.println("Plenty of money, time to party");
		}
		else if(date>15 && date<=25) {
			System.out.println("on budjet need to spend less");
		}
			else {
				System.out.println("no budget");
			}
		
		// Switch statement
		String level="expert";
		int level1 = 0;                 // given variable Declaration
		switch(level) {
		case "Beginner": level1=1;
		break;
		case "intermediate": level1=2;
		break;
		case "expert": level1=3;
		break;
		default:level1=0;
		break;
		}
		System.out.println("your level1 is:"+level1);
		
		}
		}
	

