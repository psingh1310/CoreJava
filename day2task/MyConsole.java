import java.io.Console;
import java.lang.Object;

public class MyConsole{
	private static Console con=System.console();
	public static String getString(String que){
      System.out.println(que);
      return con.readLine();
	}

	public static int getNumber(String que){
      return Integer.parseInt(getString(que));
	}
    public static double getDouble(String que){
      return Double.parseDouble(getString(que));
	}
    public static void print(Object data){
    	System.out.println(data);
    }
	}