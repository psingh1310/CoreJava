import java.io.Console;
//import java.lang.*;

class SecondDemo{
	static Console con = System.console();
	public static void main (String[] args) {
		int a = Integer.parseInt(Prompt.getString("enter the age"));
        con.printf("the number is %d",a);
     

		// String name=Prompt.getString("enter the name");
		// System.out.println("the name is "+name);
		// String address=Prompt.getString("enter the address");
		// System.out.println("the address is "+address);
		// String age=Prompt.getString("enter the age");
		// System.out.println("the age is "+age);
		

	}
}
class Prompt{
	static String getString(String que){
       System.console().printf(que);
       return System.console().readLine();
	}
}

