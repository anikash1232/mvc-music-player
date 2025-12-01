package org.comp301.spotify.mvcspotify.Controller;

import org.comp301.spotify.mvcspotify.Model.Song;

public interface Controller {
    void moveSongUp(int index);

    void moveSongDown(int index);

    void addSong(String title, String artist, int rating);

    void removeSong(int index);

    void shuffleSongs();
}
