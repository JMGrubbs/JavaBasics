package com.John;

import java.util.Iterator;
import java.util.LinkedList;

public class PlayList {
    private String name;
    private LinkedList<Song> playList;

    public PlayList(String name) {
        this.name = name;
        this.playList = new LinkedList<Song>();
    }

    public Integer getPlayListSize() {
        return playList.size();
    }

    public LinkedList<Song> getPlayList() {
        Iterator<Song> i=this.playList.iterator();
        while(i.hasNext()) {
            System.out.println("New playing " + i.next().getTitle());
        }
        System.out.println("==================");
        return this.playList;
    }

    public boolean addToPlayList(Song song, int position){
        if(!playList.contains(song)){
            playList.add(position, song);
            System.out.println(song + " has been added!");
            return true;
        }
        else{
            System.out.println("Song already on playlist");
            return false;
        }
    }

    public boolean removeSong(Song song){
        if(playList.contains(song)){
            playList.remove(song);
            System.out.println("Song has been removed!");
            return true;
        }
        else {
            System.out.println("Song not found.");
            return false;
        }
    }

















}
