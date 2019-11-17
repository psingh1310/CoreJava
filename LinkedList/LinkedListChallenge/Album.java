package com.prashant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
   private String name;
   private String artist;
   private ArrayList<Song> songs;

   public Album(String name, String artist){
       this.name = name;
       this.artist = artist;
       this.songs = new ArrayList<>();  //initialization
   }

   //adding song into the ArrayList
    public boolean addSongs(String title, double duration){
       if(findSong(title) == null){
           this.songs.add(new Song(title, duration));
           return true;
       }
       return false;
    }

    //findSong method(implementing findSong privately)
    private Song findSong(String title){
       for (Song checkedSong : this.songs)
       {
           if (checkedSong.getTitle().equals(title)){
               return checkedSong;
           }
       }
       return null;
    }

    //add song to the playlist using trackNumber (Creating the arraylist of the type Song having object playlist)
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
       int index = trackNumber - 1;
       if ((index >= 0) && (index <= this.songs.size())){
           playList.add(this.songs.get(index)); //here we are taking song from songs list and adding to the playlist
           return true;
       }
       MyConsole.print("This Playlist does not have the track " +trackNumber);
       return false;
    }

    //add song to the playlist using title
    public boolean addToPlayList(String title, LinkedList<Song> playList){
       Song checkedSong = findSong(title);
       if (checkedSong != null){
           playList.add(checkedSong);
           return true;
       }
       MyConsole.print("The Song " +title+ " is not in the album");
       return false;
    }
}
