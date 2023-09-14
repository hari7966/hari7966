package HariKrishna;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hai everyone");
       One obj = new One();
       obj.Anantapur();
       obj.Andhrapradesh();
       obj.India();
       Two obj1 = new Two(); 
      obj1.Krishna();
      obj1.Bengalore();
      Three obj2 = new Three(); 
      obj2.Myworld();
      obj2.Mymusic();
	}
  
}
class One{
	static String famousroad = "Gandhiroad"; //Static variable
    int length = 300;   //Non-Static
	
	public void Anantapur() {
		System.out.println("this is Anantapur");
		System.out.println(famousroad);
		System.out.println(length);
		
	}
	public void Andhrapradesh() {
		 int Numofregions = 2;   //Local variable
		System.out.println("this is Andhrapradesh");
		System.out.println(Numofregions);
		System.out.println();
	}
	public void India() {
		System.out.println("My India");
	}
}
class Two{
	static String favouriteplace = "ladak";   //Static variable
    int radiusplace = 400;      //Non-Static
    
	public void Krishna() {
		System.out.println("this is Krishna");
		System.out.println(favouriteplace);
		System.out.println(radiusplace);
		System.out.println();
	}
	public void Bengalore() {
		String Statename = "Karnataka";
		System.out.println("this is Bengalore");
		System.out.println(Statename);
	}
}
class Three{
	static String favouritebike = "Hunter350";     //static variable
    int Cost = 250000;        //Non-Static
	public void Myworld() {
		System.out.println("this is Myworld");
		System.out.println();
	}
	public void Mymusic() {
		int numofsongs = 10;      //Local variable
		String Movie = "Pokiri";
		System.out.println("this is Mymusic");
		System.out.println(numofsongs);
      System.out.println(Movie);	
      System.out.println();
		System.out.println(favouritebike);
		System.out.println(Cost);
	}
}
