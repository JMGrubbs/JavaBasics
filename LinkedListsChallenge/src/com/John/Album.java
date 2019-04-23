package com.John;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> album;

    public Album(String name) {
        this.name = name;
        this.album = new ArrayList<Song>();
    }

    public Song findSong(String title){
        for(int i = 0; i < album.size(); i++){
            if(album.get(i).getTitle() == title){
                return album.get(i);
            }
        }
        return null;
    }

    public boolean addSong(String title){
        Song newSong = new Song (title);
        if(album.contains(newSong)){
            System.out.println("This song is already in the album!");
            return false;
        }
        else{
            System.out.println("The song has been added to the album.");
            album.add(newSong);
            return true;
        }
    }

    public boolean removeSong(Song song){
        if(album.contains(song)){
            album.remove(song);
            System.out.println("Song has been removed!");
            return true;
        }
        else {
            System.out.println("Song not found.");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }
}

// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
// Create a Song class having Title and Duration for a song.
