import java.io.Console;

class ArrayExample {
   public static void main(String[] args){
   	  //simpleArray();
   	//otherSyntax();
   	//forEachSyntax();
   	//multiDimensionalArray();
   	jaggedArray();
   }
   	static void simpleArray(){
   		int values[] = new int[5];
   	for(int i=0;i<5;i++){
   		values[i]=i+1;
   	}
   	for(int i=0;i<5;i++){
   		System.console().printf("%d:%d\n",i,values[i]);
   	}
   	} 
   	static void otherSyntax(){
   		int size=MyConsole.getNumber("enter no of fruits");
   		String[] fruits = new String[size];
   		for(int i=0;i<size;i++){
   			fruits[i]=MyConsole.getString("enter the fruit");
   		}
   		for(int i=0;i<size;i++){
            MyConsole.print(fruits[i]);
   		}
   	}
   	static void forEachSyntax(){
        int[] scores = {34,45,56,34,34};
        for (int score :scores ) {
        	MyConsole.print(score);
        }
   	}
   	static void multiDimensionalArray(){
   		int[][] marks ={{34,45,34,45},{33,45,34,45},{34,45,34,45},{34,45,34,45},{34,45,34,45}};
   		for(int i=0;i<5;i++){
   			for(int j=0;j<4;j++){
   				System.out.print(marks[i][j]+" ");
   			}
   			System.out.println();
   		}
   	}
    static void jaggedArray(){
    	int[][] school = new int[4][];
        school[0]=new int[]{34,45,45,45};
        school[1]= new int[]{34,23,23,67,56,56,45};
        school[2]=new int[]{34,56,56,45,35};
        school[3]= new int[]{56,45,67,89,67,56,35,46,57};
        for (int i=0;i<school.length ;i++ ) {
        	 for (int score : school[i]) {
        	 	System.out.print(score+" ");
        	 }
        	 MyConsole.print("");
        }
    }
}
