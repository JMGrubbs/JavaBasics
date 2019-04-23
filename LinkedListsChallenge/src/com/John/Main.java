package com.John;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayList playList = new PlayList("POP");
        Cover cover = new Cover();
        cover.createAlbum("Boom");
        cover.createAlbum("Beep");
        cover.createAlbum("Bop");
        cover.createAlbum("Bap");
        cover.createAlbum("BOOB");
        cover.addSongToAlbum(0, "Hit1");
        cover.addSongToAlbum(0, "Hit2");
        cover.addSongToAlbum(0, "Hit3");
        cover.addSongToAlbum(0, "Hit4");
        cover.addSongToAlbum(1, "Hit6");
        cover.addSongToAlbum(1, "Hit7");
        cover.addSongToAlbum(1, "Hit8");
        cover.addSongToAlbum(1, "Hit9");

        run(cover, playList);
    }

    public static void run(Cover cover, PlayList playList){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        printMenu();

        while(running){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 1:
                    printMenu();
                    break;
                case 2:
                    System.out.println("Album Name:");
                    String name = scanner.nextLine();
                    createAlbum(cover, name);
                    break;
                case 3:
                    addSongToAlbum(scanner, cover);
                    break;
                case 4:
                    viewAlbum(scanner, cover);
                    break;
                case 5:
                    addSong(scanner, cover, playList);
                    break;
                case 6:
                    cyclePlayList(scanner, playList);
                    break;
                case 7:
                    removePlayListSong(scanner, playList);
                    break;
                case 0:
                    running = false;
                    break;
            }
        }
    }

    public static void cyclePlayList(Scanner scanner, PlayList playList){
        playList.getPlayList();
    }

    public static void removePlayListSong(Scanner scanner, PlayList playList){
        cyclePlayList(scanner, playList);
        System.out.println("Select song to remove");
        int action = scanner.nextInt();
        scanner.nextLine();
        Song temp = playList.getPlayList().get(action+1);
        playList.removeSong(temp);
    }

    public static void addSong(Scanner scanner, Cover cover, PlayList playList){
        cycleAlbums(cover);
        int action = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Song> list = cover.getAlbums().get(action-1).getAlbum();
        for(int i = 0; i < list.size(); i++){
            System.out.println((i+1) + " - " + list.get(i).getTitle());
        }
        System.out.println("Enter song number:");
        int action2 = scanner.nextInt();
        scanner.nextLine();
        playList.addToPlayList(list.get(action2-1), playList.getPlayListSize());
    }


    public static void cycleAlbums(Cover cover){
        System.out.println("Select album to add song.");
        for(int i = 0; i < cover.getAlbums().size(); i++){
            System.out.println((i+1) + " - " + cover.getAlbums().get(i).getName());
        }
    }


    public static void viewAlbum(Scanner scanner, Cover cover){
        cycleAlbums(cover);
        int action = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Song> list = cover.getAlbums().get(action - 1).getAlbum();
        for(int i = 0; i < list.size(); i++){
            System.out.println((i-1) + " - " + list.get(i).getTitle());
        }
    }

    public static void printMenu(){
        System.out.println("1 - Print Menu");
        System.out.println("2 - Create Album");
        System.out.println("3 - Add Song to album");
        System.out.println("4 - View Albums");
        System.out.println("5 - Add song to playList");
        System.out.println("6 - Get playList");
        System.out.println("7 - Remove song");
        System.out.println("0 - Quit");
    }

    public static void createAlbum(Cover cover, String name){
        cover.createAlbum(name);
    }

    public static void addSongToAlbum(Scanner scanner, Cover cover){
        cycleAlbums(cover);
        int action = scanner.nextInt();
        System.out.println("Song Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        cover.getAlbums().get(action - 1).addSong(name);
    }

    public static void playList(LinkedList<Song> linkedList){

    }
}
// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
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