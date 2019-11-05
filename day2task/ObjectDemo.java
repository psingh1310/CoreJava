import java.io.Console;
import java.lang.Object;

class ObjectDemo{

	public static void main(String[] args){
	Object data = 123;
	//int temp = (int)data;
	//temp++;
	//data = temp;
	MyConsole.print(data);
	data ="sample code";
	MyConsole.print(data);
	data =46000.5644;
	MyConsole.print(data);
}
}