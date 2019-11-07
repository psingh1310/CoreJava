package com.prashant;

//Base class
class Movie{
    private String name;
    //constructor
    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Ted extends Movie{
    public Ted(){
        super("TED");  //we are initializing  the name field from the base(Movie) class in the Ted class
    }

    public String plot(){
        return "Story of the ted";
        //the parent class method is overriden here
    }
}

class SchindelersList extends Movie{
    public SchindelersList(){
        //here we are creating a constructor without any argument
        super("Schindelers List");
    }

    public String plot(){
        return "Story of the world war two";   //overriden the parent class
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    public String plot(){
        return "Kids try and scape a maze";    //overriden the parent class
    }
}

class InfinityWar extends Movie{
    public InfinityWar(){
        super("Infinity War");       //overriden the parent class
    }
   @Override
    public String plot(){
        return "Science Fiction";
    }
}

class ForgatableMovie extends Movie{
    public ForgatableMovie(){
        super("Forgatable Movie");
    }
    //No plot method
}



public class Main {

    public static void main(String[] args) {

        //using the polymorphism to call the plot method of the relevant class
        for(int i = 1; i < 11; i++){
            //variable movie
            Movie movie = randomMovie();

            System.out.println("Movie # " + i +
                    " : " + movie.getName() + "\n" +
                    " plot: " + movie.plot() + " \n");


            //movie.plot() method is here implementing the polymorphism
            /*we are assigning the different functionality depending on the type of object
            * that we are created and all these objects are inheriated from the base Movie class*/



        }
    }

    //create a static method to return a random movie
    public static Movie randomMovie(){
        //return type Movie
        //for generating the random movie we need random number
        //for that we are using the maths class

        int randomNumber = (int)(Math.random() * 5) + 1;
                //by default it will return a random number a double between 0 and 1
        //and we are converting that to a integer and * by 5 to get 0 to 4 +1 to get between 1 & 5
        System.out.println("Random Number generated was " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Ted();
            case 2:
                return new SchindelersList();
            case 3:
                return new MazeRunner();
            case 4:
                return new InfinityWar();
            case 5:
                return new ForgatableMovie();
        }
        return null;
    }
}
