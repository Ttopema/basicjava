package chap08.oop.polyinterface;

interface ParentInterA{
	void testA();
}

interface ParentInterB{
	void testB();
}

class SuperClass{
	public void display() {
		System.out.println("superclass");
	}
}

class childClass extends SuperClass implements ParentInterA, ParentInterB{

	@Override
	public void testA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testB() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MyInterfaceTest02 {
	public static void main(String[] args) {
		childClass obj = new childClass();
		ParentInterA obj2 = new childClass();
		ParentInterB obj3 = new childClass();
		SuperClass obj4 = new childClass();
	}

}
