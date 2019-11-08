package com.prashant;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

class Student{
    int id;
    String name;
    double totalMarks;

    public Student(int id, String name, double totalMarks) {
        this.id = id;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class StudentDB{
    private static List<Student> allStudents = new LinkedList<Student>();
    public static void addNewStudent(Student stu) throws Exception{
         if (stu != null){
             allStudents.add(stu);
         } else throw new Exception("Student details are not set");
    }
}

public class Main {

    private static void handlingNullException(){
        try {
//            Student st = null;
//            st.name = "Kumar";
//            st.id = 124;
//            st.totalMarks = 500;
            Student student = new Student(125,"Singh",540);
            MyConsole.print(String.format("the name is %s and the score is %.3f",
                    student.name,student.totalMarks));
        }catch(NullPointerException e){
         MyConsole.print("null pointer exception");
        }
    }

    private static void numberFormatException(){


        try {
            MyConsole.getNumber("enter the number");
        } catch (NumberFormatException ex){
            MyConsole.print("Invalid input");
        } finally {
            MyConsole.print("Executed on all conditions whether an exception occurs" +
                    " or not.This is the last" +
                    " statement that executes within the try..catch...finally blocks");
        }

    }

    private static void arrayExceptionImplementation(){
        boolean validate = true;
        int [] elements = {45,54,68,78,70};
        do {
            try{
                int index = MyConsole.getNumber("Enter the index");
                MyConsole.print("The value at index :" + elements[index]);
                validate = true;
            }catch(ArrayIndexOutOfBoundsException ex){
                     MyConsole.print("ArrayIndexOutOfBoundException");
                     validate = false;
            }
        }while(validate == false);
    }

    private static void arithmeticExceptionHandling(){
        boolean failed = true;
        do {
          try {
              int first = MyConsole.getNumber("Enter the first Number");
              int second = MyConsole.getNumber("Enter the Second NUmber");
              int result = first/second;
              MyConsole.print("The Result of the operation is: " +result);
              failed = false;
          }catch (ArithmeticException e){
             MyConsole.print("Divide by zero is not possible ArithmeticException Occur");
             failed = true;
          }
        }while (failed == true);
    }


    public static void main(String[] args) {

     //   numberFormatException();
    //    arrayExceptionImplementation();
       // arithmeticExceptionHandling();
     //   handlingNullException();

//        StudentDB student = new StudentDB();
//        try {
//            student.addNewStudent(new Student(127,"PSingh",574));
//            MyConsole.print(student);
//        }catch (Exception e){
//           e.printStackTrace(); //to show error in console
//        }

        CollectionDemo demo = new CollectionDemo();
      //  demo.arrayListExample();
       // demo.setExample();
        demo.mapExample();
    }
}

