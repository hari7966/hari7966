package HariKrishna;

public class DemoClass {
	public static void main(String[]args) {
		C b=new C();
		b.meth1();
		
	}

}
class C{
	private int num=100;
	private void meth() {
		System.out.println("Public method");
	}
	public void meth1() {
		System.out.println(num);
		meth();
	}
}