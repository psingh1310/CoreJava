import java.util.*;
import java.io.Console;

class Expence{
	private int id;
	private double amount;
	private String details;
	private Date date;

	Expence(int id,double amount,String details,Date date ){
		this.id=id;
		this.amount=amount;
		this.details=details;
		this.date=date;
	}

	public int getId(){
		return id;
	}
	public double getAmount(){
		return amount;
	}
	public String getDetails(){
		return details;
	}
	public Date getDate(){
		return date;
	}

	public String toString(){
		return String.format("Details:%s\nAmount:%f\nExpenseID:%d",details,amount,id);
	}

	public void setID(int id){
		this.id=id;
	}
	public void setDetails(String details){
		this.details=details;
	}
	public void setAmount(double amount){
		this.amount=amount;
	}
	public void setDate(Date date){
		this.date=date;
	}
	
}

class ExpenceManager{
	protected Expence[] allExpences;
	int size=0;
	ExpenceManager(int size){
	 allExpences=new Expence[size];
	 this.size=size;
	}

	public void addNewExpence(Expence ex){
        for (int i=0;i<size ;i++ ) {
        	// if(allExpences[i].Expence.getId() == 0){
        		System.out.println(ex.getId());
        		// allExpences[i].Expence.getId()=ex.getId();
        		// allExpences[i].Expence.getDetails()=ex.getDetails();
        		// allExpences[i].Expence.getAmount()=ex.getAmount();
        		// allExpences[i].Expence.getDate()=ex.getDate();

        	//}
        }
	}  
	public void updateExpence(Expence ex){


	}
	public void deleteExpence(int id){

	}
	public Expence[] findExpence(String details){
      return null;
	}
 } 
 class ExpenceFactory{
 	public static ExpenceManager expenceManager(String type){
       if(type.equals("Array")){
       	int size=MyConsole.getNumber("enter the number of expences to hold");
       	return new ExpenceManager(size);
       }
       return null;
 	}
 }
 

 class ExpenceApp{
    static ExpenceManager mgr = ExpenceFactory.expenceManager("Array");

    private static String getMenu(){
		String menu = "~~~~~~EXPENSE MANAGER SOFTWARE~~~~~~~~\n";
		menu += "TO ADD NEW EXPENSE------------->PRESS 1\n";
		menu += "TO DELETE AN EXPENSE----------->PRESS 2\n";
		menu += "TO FIND EXPENSES--------------->PRESS 3\n";
		menu += "NOTE: ANY OTHER KEY IS CONSIDERED AS EXIT";
		return menu;
	}

    public static void main(String[] args) {
    	if(mgr==null){
    		MyConsole.print("opps something wrong happened!!!!!!");
    	}
     processProgram();

    }

    private static void processProgram(){
    	boolean processing= true;
    	String menu = getMenu();
    	do{
    		int choice=MyConsole.getNumber(menu);
    		processing=processMenu(choice);
    	}while(processing);
    }

    private static boolean processMenu(int choice){
    	switch(choice){
    		case 1:
    		addingExpence();
    		return true;
    		case 2:
    		deletingExpence();
    		return true;
    		case 3:
    		findingExpence();
    		return true;
    		default:
    		return false;
    	}
    }
    private static void findingExpence(){
    	String details=MyConsole.getString("enter the details");
    	try{
    		Expence[] expence =mgr.findExpence(details);
    	for (Expence ex :expence ) {
    		if(ex!=null){
    			MyConsole.print(ex);
    		}
    	}
    }catch(Exception ex){
    	MyConsole.print(ex.getMessage());
    }
}
   private static void addingExpence(){
   	try{
   		int id=MyConsole.getNumber("enter the id");
   		String detail=MyConsole.getString("enter details");
   		double amount=MyConsole.getDouble("enter the amount");
   		int dd=MyConsole.getNumber("enter the day");
   		int mm=MyConsole.getNumber("enter the month");
   		int yy=MyConsole.getNumber("enter the year");
   		Date dt=new Date(yy,mm,dd);
   		Expence exp = new Expence(id,amount,detail,dt);
   		mgr.addNewExpence(exp);
   		MyConsole.print("added succesfully");   	
   	}catch(Exception ex){
   		MyConsole.print(ex.getMessage());
   	}
   }
   private static void deletingExpence(){
   	try{
   		int id=MyConsole.getNumber("enter the id");
   		mgr.deleteExpence(id);
   		MyConsole.print("deleted suceesfully");
   	}catch(Exception ex){
   		MyConsole.print(ex.getMessage());
   	}
   }
 }