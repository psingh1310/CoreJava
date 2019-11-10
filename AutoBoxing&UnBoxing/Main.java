package com.prashant;

import java.util.ArrayList;


//wrapper class
class IntClass{
    private int myvalue;

    public IntClass(int myvalue) {
        this.myvalue = myvalue;
    }

    public int getMyvalue() {
        return myvalue;
    }

    public void setMyvalue(int myvalue) {
        this.myvalue = myvalue;
    }
}



public class Main {

    public static void main(String[] args) {
        //ArrayList<int> ints = new ArrayList<int>();  //because int is a primitive data type

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(13));

        Integer integer = new Integer(13);           //integer is a class

        Double dobuleValue = new Double(13.13); //Double is a class

        ArrayList<Integer> intArrayLisst = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            intArrayLisst.add(Integer.valueOf(i));  //AutoBoxing -> converting the int type into the Integer
            //Primitive type into the object wrapper of type Integer.
        }

        for (int i = 0; i < 10; i++){
            System.out.println(i + " --> " + intArrayLisst.get(i).intValue());
            //Unboxing is converting the class back to the primitive data type.
            //here integer is converted back to the int

        }

        /******************************************************/

        Integer myIntValue = 50;  //Actually compiler is executing it as
                                 //Integer myIntValue = Integer.valueOf(50)
                                //myIntValue is an object
        int myInt = myIntValue.intValue(); //Boxing and Unboxing


        /**************************************************************/

        ArrayList<Double> myDoubleValue = new ArrayList<Double>();

        for (double dbl = 0.00; dbl <= 10.00; dbl += 0.5){
              //  myDoubleValue.add(Double.valueOf(dbl));  //AutoBoxing

            myDoubleValue.add(dbl); //same as above but short cut

            /*Converting a primitive value into an object of the corresponding wrapper
            class is called autoboxing*/
        }

        for (int i = 0; i < myDoubleValue.size(); i++){
          //  double value = myDoubleValue.get(i).doubleValue();
            double value = myDoubleValue.get(i); //same as above but short cut

            System.out.println(i + " -> " + value);    //Unboxing

            /*Converting an object of a wrapper type to its corresponding primitive
             value is called Unboxing*/
        }




    }
}
