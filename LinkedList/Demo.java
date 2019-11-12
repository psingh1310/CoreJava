package com.prashant;

import java.util.*;

public class Demo {
    //psvm
    public static void main(String[] args) {
              //Collection LinkedList  of class String
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Patna");
        addInOrder(placesToVisit, "Delhi");
        addInOrder(placesToVisit, "Mumbai");
        addInOrder(placesToVisit, "Pune");
        addInOrder(placesToVisit, "Bangalore");
        addInOrder(placesToVisit, "Chennai");
        addInOrder(placesToVisit, "Mysore");

        printList(placesToVisit);

         addInOrder(placesToVisit, "Chandigarh");
         addInOrder(placesToVisit, "Patna");
         printList(placesToVisit);
         visit(placesToVisit);

    }







//        placesToVisit.add("Patna");
//        placesToVisit.add("Delhi");
//        placesToVisit.add("Mumbai");
//        placesToVisit.add("Pune");
//        placesToVisit.add("Bangalore");
//        placesToVisit.add("Chennai");
//        placesToVisit.add("Rameshwaram");
//
//        //method
//        printList(placesToVisit);
//
//        //Now Insert Mysore at index position 1
//        placesToVisit.add(1,"Mysore");
//       printList(placesToVisit);
//
//       //Now remove element at index 6 Chennai
//        placesToVisit.remove(6);
//        printList(placesToVisit);
//    }

     //it uses the concept of iterator
    //argument is the complete list



    private static void printList(LinkedList<String> linkedList){
        //Iterator(going through all the elements in the list)
        //‘Iterator’ is an interface which belongs to collection framework

        Iterator<String> i = linkedList.iterator();   //iterator method is part of Iterator Interface
        while (i.hasNext()){
            //hasNext -> pointing to another element to visit(is their another entry )
            System.out.println("Now visiting " + i.next());    // i.next() -> moving to the next entry
        }
        System.out.println("==========================");

    }


    //SingallyLinkeList

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        //ListIterator
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            //comparing the elements
            int comparision = stringListIterator.next().compareTo(newCity); //newCity -> city that we insert
            //it returns a number  (if its zero it means equal (match))
            if (comparision == 0){
                //equal do not add
                System.out.println(newCity + " is already included as destination");
                return false;  //wasn't successfully added
            } else if(comparision > 0){
                //new city should appear before this
                //Mumbai -> Delhi
                stringListIterator.previous(); // this take back to current element in the list where we have to add
                stringListIterator.add(newCity);
                return true;
            } else if (comparision < 0){
                //move on next city
               //Leave as it is
            }
        }

        stringListIterator.add(newCity);
        return true;
    }


    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()){
            //No city is Found
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday is over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                        listIterator.next();
                        }goingForward = true;

                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        } goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now Visiting: " +listIterator.previous());
                } else {
                        System.out.println("we are at the start of the List");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }


    private static void printMenu(){
        System.out.println("Available options:\nPress");
        System.out.println("0- to quit\n" +
                "1- To go to the next\n" +
                "2 - To go to the previous\n" +
                "3 - Print Meanu options");
    }
}
