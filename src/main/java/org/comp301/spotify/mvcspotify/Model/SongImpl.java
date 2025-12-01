package org.comp301.spotify.mvcspotify.Model;

public class SongImpl implements Song{

    private String title;
    private String artist;
    private int rating;

    public SongImpl (String title, String artist, int rating){
        this.title = title;
        this.artist = artist;

        if (rating > 0 || rating <= 5){
            this.rating = rating;
        }
        else{
            System.out.println("ratings can only be between 0-5");
        }
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getArtist() {
        return this.artist;
    }

    @Override
    public int getRating() {
        return this.rating;
    }
}
