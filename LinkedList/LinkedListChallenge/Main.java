package com.prashant;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Evolve", "Imagine Dragns");
        album.addSongs("Whatever It Takes", 3.40);
        album.addSongs("Walking the Wire", 3.45);
        album.addSongs("I Don't Know Why", 3.52);
        album.addSongs("I'll Make It Up to You", 3.45);
        albums.add(album);  //putting into Album list

        album = new Album("Coldplay", "A head full of dreams"); //this is a new object that is different than previous
        album.addSongs("A Head Full of Dreams", 3.43);
        album.addSongs("Birds", 3.49);
        album.addSongs("Hymn for the Weekend", 4.18);
        album.addSongs("Adventure of a Lifetime", 4.23);
        album.addSongs("Everglow", 4.42);
        albums.add(album);


        //putting the songs into the playlist(LinkedList)
        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Whatever It Takes", playList);
        albums.get(0).addToPlayList("Walking the Wire", playList);
        albums.get(0).addToPlayList("I Don't Know Why", playList);
        albums.get(1).addToPlayList("Birds", playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(5, playList);
      albums.get(1).addToPlayList(7, playList);
        albums.get(1).addToPlayList(24, playList);

        play(playList);

    }


    //LinkedList of the Song Object
    public static void play(LinkedList<Song> playList){

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0){
            MyConsole.print("No Songs in the playlist");
            return;
        }else {
            MyConsole.print("Now Playing " +listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    MyConsole.print("playlist complete");
                    quit = true;
                    break;
                case 1:
                    //Very Important Concept for LinkedList(forward)
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        MyConsole.print("Now Playing : " + listIterator.next().toString());
                    } else {
                        MyConsole.print("we have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    //Very Important Concept for LinkedList(backward)
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        MyConsole.print("Now playing: " + listIterator.previous().toString());
                    } else {
                        MyConsole.print("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    //To repeat the song
                    if (forward){
                        if (listIterator.hasPrevious()){
                            MyConsole.print("Now replaying: " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            MyConsole.print("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()){
                            MyConsole.print("Now replaying: "+listIterator.next().toString());
                            forward = true; //we have to go forward to replay the song
                        } else {
                            MyConsole.print("We have reached the end of the list");
                        }
                    }

                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            MyConsole.print("Now playing: " + listIterator.next().toString());
                        } else if(listIterator.hasPrevious()){
                            MyConsole.print("Now playing: " +listIterator.previous().toString());
                        }
                    }
                    break;

            }
        }

    }

    private static void printMenu(){
        MyConsole.print("Available actions:\n press");
        MyConsole.print("0 - To quit\n" +
                "1- To play the next song\n" +
                "2- To play the previous song\n" +
                "3- To repeat the song\n" +
                "4- List songs in the playlist\n" +
                "5- Print available actions.\n" +
                "6- delete current song from the playlist");
    }

    //List songs in the playlist
    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        MyConsole.print("==========================");
        while (iterator.hasNext()){
            MyConsole.print(iterator.next());
        }
        MyConsole.print("==========================");
    }

}
