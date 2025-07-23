package JavaProblems;
import java.util.*;

class Song{
	private String SongName;
	
	public Song(String SongName) {
		this.SongName = SongName;
	}
	
	public String getSongName() {
		return SongName;
	}
}

class Playlist{
	private LinkedList<Song> songs;
	
	public Playlist() {
		songs = new LinkedList<>();
	}
	
	public void addSongEnd(Song song) {
		songs.addLast(song);
	}
	
	public void addSongStart(Song song) {
		songs.addFirst(song);
	}
	
	public void removeSong() {
		if(!songs.isEmpty()) {
			songs.removeFirst();
		}
	}
	
	public Song playNext() {
		if(!songs.isEmpty()) {
			songs.getFirst();
		}
		return null;
	}
	
	public boolean isEmpty() {
		return songs.isEmpty();
	}
}

class MediaPlayer {
    public void play(Song song) {
        System.out.println("Playing: " + song.getTitle());
    }
}

class MusicPlayer extends MediaPlayer {
    private Playlist playlist;

    public MusicPlayer() {
        playlist = new Playlist();
    }

    public void addSong(Song song) {
        playlist.addSongEnd(song);
    }

    public void playNextSong() {
        Song next = playlist.playNext();
        if (next != null) {
            play(next);
            playlist.removeSong();
        } else {
            System.out.println("No songs left in the playlist.");
        }
    }
}

public class MusicApp {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.addSong(new Song("Song A"));
        player.addSong(new Song("Song B"));
        player.addSong(new Song("Song C"));

        player.playNextSong();
        player.playNextSong();
        player.playNextSong();
        player.playNextSong();
    }
}

