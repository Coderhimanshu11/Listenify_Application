package Listenify;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//import static java.lang.StringUTF16.compareTo;
//import static java.lang.StringUTF16.indexOf;

public class Album {
    public String albumName;
    public String artistName;
    public List<Song> songList;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList = new ArrayList<>();

    }

    public boolean findSongInAlbum(String title) {

        for (Song song : songList) {

            if ((song.title).equals(title)) {
                return true;
            }
        }
        return false;
    }

    public String addSongToAlbum(String title, double duration) {
        //check if the song is already present we will not add
        // otherwise we will create a new song and add it to the songList
        if (findSongInAlbum(title) == true) {
            return "song is already present";
        } else {
            //i need to create a song  object then add it to songList
            Song newSong = new Song(title, duration);
            songList.add(newSong);
            return "New song has been added sucessfully";
        }

    }

    public String addSongToPlayList(int trackNo, LinkedList<Song> playList) {
 //trackNo is a no in the songList
        //TrackNO: 1,2,3,4,5............
        //indicies : 0,1,2,3,4....
        int index= trackNo-1;
        //Put a validation to avoid duplicate
        //checking for validity
        if (index>=0 && index<this.songList.size()){
            Song song = this.songList.get(index);
            playList.add(song);
            return "Song added to the playList";
        }
        return "Invalid track No.";
    }
    public String addSongToPlayList(String title,LinkedList<Song> playList){
//I need to find out that song with that title
        //and put it in the playlist
        for(Song song :songList){
           if (song.title==title){
               playList.add(song);
               return "song has been added successfully";
               }

    }
            return "song does not excist";
        }


}






