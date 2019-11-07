package basics;
class Parent{
	public  void parentFunc() {
       MyConsole.print("parent function");			
	}
}
class ChildClass extends Parent {
	
	public void parentFunc() {
		MyConsole.print("child function");
	}
	public void newFunc() {
		MyConsole.print("new function");
	}
}

public class InheritanceEx {
	
	
	public static void main(String[] args) {
	  
	  Parent cls=new Parent();
	  cls.parentFunc();
	  cls = new ChildClass();
	  cls.parentFunc();
	  ((ChildClass)cls).newFunc();
	}

}
