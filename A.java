package HariKrishna;

public class A {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		
		b.meth1();
		a.meth2();
	}
	public void meth2() {
		System.out.println("Default Method");

		}
}
class B{
	 private int number=50;
	 private void  meth() {
		 System.out.println("Private Method");
	 }
	 void meth1() {
		 System.out.println("number");
		 meth();
	 }
}