import java.io.*;
import java.lang.*;

class Calculator{
	public static void main(String[] args){
      int op;
       do{

       	int a,b;
        op = Integer.parseInt(Prompt.getString("enter the operator"));
       switch(op){
       	case 1:
        a = Integer.parseInt(Prompt.getString("enter the first value"));
        b = Integer.parseInt(Prompt.getString("enter the second value"));
        calc.getadd(a,b);
       	break;
       	case 2:
        a = Integer.parseInt(Prompt.getString("enter the first value"));
        b = Integer.parseInt(Prompt.getString("enter the second value"));
       	calc.getsub(a,b);
       	break;
       	case 3:
       	a = Integer.parseInt(Prompt.getString("enter the first value"));
        b = Integer.parseInt(Prompt.getString("enter the second value"));
       	calc.getmul(a,b);
       	break;
       	case 4:
       	a = Integer.parseInt(Prompt.getString("enter the first value"));
        b = Integer.parseInt(Prompt.getString("enter the second value"));
       	calc.getdiv(a,b);
       	break;
       	default:
       	break;
       }
     }while(op!=5);
	}
}
 
 class Prompt{
 	static Console con = System.console();
 	static String getString(String que){
 		con.printf(que);
 		return con.readLine();
 	}
 }

 class calc{
 	static void getadd(int a ,int b){
 		System.out.println(a+b);
 	}
 	static void getsub(int a ,int b){
 		System.out.println(a-b);
 	}
 	static void getmul(int a ,int b){
 		System.out.println(a*b);
 	}
 	static void getdiv(int a ,int b){
 		System.out.println(a/b);
 	}
 }