//package Listenify;
//
//import java.util.*;
//
//public class Main {
//    public static List<Album> albums = new ArrayList<>();
//
//    public static void main(String[] args) {
//
//        System.out.println("Hello and welcome!");
//        Album album = new Album("Old hindi songs", "Arijit Singh");
//        album.addSongToAlbum("Pathaan", 4.5);
//        album.addSongToAlbum("channa mereya", 3.5);
//        album.addSongToAlbum("Naina", 5.0);
//        albums.add(album);
//        album = new Album("Kasoor", "Eminem");
//        album.addSongToAlbum("Tum mile", 4.5);
//        album.addSongToAlbum("Baarishein", 4.5);
//
//        albums.add(album);
//        LinkedList<Song> playList_1 = new LinkedList<>();
//        albums.get(0).addSongToPlayList("Pathaan", playList_1);
//        albums.get(0).addSongToPlayList("Naina", playList_1);
//        albums.get(1).addSongToPlayList("Kasoor", playList_1);
//        albums.get(1).addSongToPlayList("Baarishein", playList_1);
//
//        //print the playList that has been added
//        play(playList_1);
//    }
//
//    public static void play(LinkedList<Song> playList) {
//        ListIterator<Song> listIterator = playList.listIterator();
//        //validation checks
//        if (playList.size() == 0) {
//            return;
//        }
//
//
//        Scanner sc = new Scanner(System.in);
//        // printMenu();
//
//        System.out.println("Now playing " + listIterator.next());
//        boolean forward = true;
//        boolean quit = false;
//        while (quit == false) {
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 0:
//                    quit = true;
//                    break;
//
//                case 1:
//                    if (forward == false) {
//                        listIterator.next();
//                    }
//                    if (listIterator.hasNext()) {
//                        System.out.println(listIterator.next().toString());
//                    }
//                    //to play the next song
//                    break;
//                case 2:
//                    if (forward == true) {
//                        //alrady toward of the last printed value
//                        listIterator.previous();
//                        forward = false;
//                    }
//                    if (listIterator.hasPrevious()) {
//                        System.out.println(listIterator.previous().toString());
//                    } else {
//                        System.out.println("you are already at the first song");
//                    }
//
//                    // to pray the previous song
//                    break;
//                case 3:
//                    if (forward == true) {
//                        // I ama on the RHS: print teh prevoius
//                        System.out.println(listIterator.previous().toString());
//                        forward = false;
//                    } else {
//                        //I am in the LHS:
//                        System.out.println(listIterator.next().toString());
//                    }
//                    // replay the current song
//                case 4:
//                    printAllSongs(playList);
//                    break;
//                case 5:
//                    printMenu();
//                    break;
//                case 6:
//                    //delete song
//                    break;
//            }
//        }
//    }
//
//    private static void printAllSongs(LinkedList<Song> songs) {
//        // for(song song : songs){
//        //try for each loop
//        ListIterator<Song> listIterator = songs.listIterator();
//
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next().toString());
//
//        }
//
//
//        private static void printMenu() {
//            System.out.println("Available option\n press");
//            System.out.println("0 - to quit\n" +
//                    "1 - to play next song\n" +
//                    "2 - to play previous song\n" +
//                    "3 - to replay teh current song\n" +
//                    "4 - list of all song \n" +
//                    "5 - print all available option\n" +
//                    "6 - delete current song");
//        }
//    }
//}
//
package Listenify;

import java.util.*;

public class Main {
    public static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Album album = new Album("Old hindi songs", "Arijit Singh");
        album.addSongToAlbum("Pathaan", 4.5);
        album.addSongToAlbum("channa mereya", 3.5);
        album.addSongToAlbum("Naina", 5.0);
        albums.add(album);
        album = new Album("Kasoor", "Eminem");
        album.addSongToAlbum("Tum mile", 4.5);
        album.addSongToAlbum("Baarishein", 4.5);

        albums.add(album);
        LinkedList<Song> playList_1 = new LinkedList<>();
        albums.get(0).addSongToPlayList("Pathaan", playList_1);
        albums.get(0).addSongToPlayList("Naina", playList_1);
        albums.get(1).addSongToPlayList("Tum mile", playList_1);
        albums.get(1).addSongToPlayList("Baarishein", playList_1);

        // print the playList that has been added
        play(playList_1);
    }

    public static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        // validation checks
        if (playList.size() == 0) {
            return;
        }

        Scanner sc = new Scanner(System.in);
        // printMenu();

        System.out.println("Now playing " + listIterator.next());
        boolean forward = true;
        boolean quit = false;
        while (!quit) {
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (forward == false) {
                        listIterator.next();
                    }
                    if (listIterator.hasNext()) {
                        System.out.println(listIterator.next().toString());
                    }
                    // to play the next song
                    break;
                case 2:
                    if (forward == true) {
                        // already toward the last printed value
                        listIterator.previous();
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println(listIterator.previous().toString());
                    } else {
                        System.out.println("You are already at the first song");
                    }
                    // to play the previous song
                    break;
                case 3:
                    if (forward == true) {
                        // I am on the RHS: print the previous
                        System.out.println(listIterator.previous().toString());
                        forward = false;
                    } else {
                        // I am in the LHS:
                        System.out.println(listIterator.next().toString());
                    }
                    // replay the current song
                    break;
                case 4:
                    printAllSongs(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    // delete song
                    if (playList.size() > 0) {
                        System.out.println(listIterator.previous().toString() + "has been removed from the playList");
                        if (playList.size() > 0 && listIterator.hasPrevious()) {
                            System.out.println("Now Playing " + listIterator.next().toString());
                        } else if (playList.size() > 0 && listIterator.hasNext()) {
                            System.out.println("Now playing" + listIterator.previous().toString());

                        }
                    } else {
                        System.out.println("the playList already empty.");

                    }

                    break;
            }
        }
        }


    private static void printAllSongs(LinkedList<Song> songs) {
        // for(song song : songs){
        // try for each loop
        ListIterator<Song> listIterator = songs.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next().toString());
        }
    }

    private static void printMenu() {
        System.out.println("Available option\n press");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list of all song \n" +
                "5 - print all available options\n" +
                "6 - delete current song");
    }
}

