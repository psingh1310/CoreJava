package com.prashant;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class   Student{
    int id;
    String name;
    int totalMarks;

    Student(int id,String name,int totalMarks){
        this.id = id;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    public String toString(){
        return String.format("%d,%s,%d",id,name,totalMarks);
    }
}

public class Main {

    public static void main(String[] args) {
     fileIoOperations();
    }

    private static void fileIoOperations(){
       // writingToFile();
       //readingFromFile();
        bufferedReaderExample();
    }

    private static void bufferedReaderExample(){
        String fileName = "Sample.txt";
        List<Student> students = null;
        try {

            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            students = new ArrayList<Student>();
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] words = line.split(",");
                Student student = new Student(Integer.parseInt(words[0]),words[1],Integer.parseInt(words[2]));
                students.add(student);
            }

            bufferedReader.close();

        } catch (IOException e){
              e.printStackTrace();
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
        for (Student student : students){
            MyConsole.print(student.id + student.totalMarks);
        }
    }

    private static void readingFromFile() {
        try {
            FileReader reader = new FileReader("Sample.txt");
            int index= 0;
            while((index = reader.read()) != -1) {
                System.out.print((char)index);
            }
            reader.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    private static void writingToFile(){
        try {
            FileWriter writer = new FileWriter("Sample.txt",true);
            Student s = new Student(123,"Kumar",540);
            Student s1 = new Student(124,"Singh",640);
           Student s2 = new Student(125,"Rai",740);
            writer.write(s.toString() + "\n");
            writer.write(s1.toString() + "\n");
            writer.write(s2.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
