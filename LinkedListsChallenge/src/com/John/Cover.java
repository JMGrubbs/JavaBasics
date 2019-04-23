package com.John;

import java.util.ArrayList;

public class Cover {

    private ArrayList<Album> albums;

    public Cover() {
        albums = new ArrayList<Album>();
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void createAlbum(String name){
        Album newAlbum = new Album(name);
        albums.add(newAlbum);
        System.out.println("Album with name "+ name + " created.");
    }

    public void addSongToAlbum(int i, String title){
        albums.get(i).addSong(title);
    }
}
