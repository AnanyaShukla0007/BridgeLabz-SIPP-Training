package JavaProblems;

import java.util.LinkedList;

class Song {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Playlist {
    private LinkedList<Song> songs;

    public Playlist() {
        songs = new LinkedList<>();
    }

    public void addSongToEnd(Song song) {
        songs.addLast(song);
    }

    public void addSongToStart(Song song) {
        songs.addFirst(song);
    }

    public void removeCurrentSong() {
        if (!songs.isEmpty()) {
            songs.removeFirst();
        }
    }

    public Song playNext() {
        if (!songs.isEmpty()) {
            return songs.getFirst();
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
        playlist.addSongToEnd(song);
    }

    public void playNextSong() {
        Song next = playlist.playNext();
        if (next != null) {
            play(next);
            playlist.removeCurrentSong();
        } else {
            System.out.println("No songs left in the playlist.");
        }
    }
}

public class Main {
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
