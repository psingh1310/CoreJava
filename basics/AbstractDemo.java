package basics;

abstract class TestClass{
	public abstract void testFunc();
}
class TestImp extends TestClass {
	public void testFunc() {
		MyConsole.print("test func from subclass");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		TestClass obj = new TestImp();
		obj.testFunc();

	}

}
