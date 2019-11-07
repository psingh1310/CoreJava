package basics;
interface Example{
	void testFunc();
    default void dFunc() {
    	MyConsole.print("dafault function implementation");
    }
    
    static void statFunc() {
    	MyConsole.print("static method implementation");
    }
}

interface IFunctionalInterface{
	void OneFunc();
}

interface Simple{
	void SimpleFunc();
}

class ExampleIml implements Example,Simple{

	@Override
	public void testFunc() {
		MyConsole.print("test fucc implemetnted here");
		
	}

	@Override
	public void SimpleFunc() {
		MyConsole.print("Simple test func implementeed");
		
	}
	@Override
	public void dFunc() {
		MyConsole.print("implemented in class");
		
	}
}
public class InterfaceDemos {

	public static void main(String[] args) {
//		Example obj = new ExampleIml();
//		obj.testFunc();
//		obj.dFunc();
//	    Simple cls = new ExampleIml();
//	    cls.SimpleFunc();
//	    Example.statFunc();
	    IFunctionalInterface fn =()->{
	    	MyConsole.print("functional interface implementation");
	    };
	    fn.OneFunc();
	    

	}

}
