package org.comp301.spotify.mvcspotify.Model;

public interface Model {
    //Get the state
    Song getSong(int index);
    int getNumSongs();

    //Modify the state
    void addSong(Song song);
    void removeSong(int index);
    void moveSong(int oldIdx, int newIdx);
    void shuffleSongs();

    //observers
    void addObserver(ModelObserver observer);
    void removeObserver(ModelObserver observer);
}
