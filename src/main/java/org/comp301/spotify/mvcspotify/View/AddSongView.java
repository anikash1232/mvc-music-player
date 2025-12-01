package org.comp301.spotify.mvcspotify.View;

import javafx.scene.Parent;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class AddSongView implements FXComponent {

  @Override
  public Parent render() {
    VBox layout = new VBox();

    TextField songTitle = new TextField("Song title");
    TextField songArtist = new TextField("Song artist");
    Slider rateSlider = new Slider(0,5,0);


    return null;
  }
}
