package org.comp301.spotify.mvcspotify.View;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import org.comp301.spotify.mvcspotify.Controller.Controller;
import org.comp301.spotify.mvcspotify.Model.Model;

public class SongView implements FXComponent {
  private final Model model;
  private final Controller controller;
  private int song_index;

  public SongView(Model model, Controller controller, int song_index) {
    this.model = model;
    this.controller = controller;
    this.song_index = song_index;
  }

  @Override
  public Parent render() {
    HBox layout = new HBox();

    Button deleteButton = new Button("❌");

    Button upButton = new Button("▲");
    upButton.setOnAction(
        (actionEvent -> {
          this.controller.moveSongUp(this.song_index);
        }));

    Button downButton = new Button("▼");
    downButton.setOnAction(
        (actionEvent -> {
          this.controller.moveSongDown(this.song_index);
        }));

    Label songInfo =
        new Label(
            this.model.getSong(this.song_index).getTitle()
                + " "
                + this.model.getSong(this.song_index).getArtist()
                + " ("
                + this.model.getSong(this.song_index).getRating()
                + ") "
                + getStars(this.model.getSong(this.song_index).getRating()));

    layout.getChildren().addAll(deleteButton, upButton, downButton, songInfo);

    return layout;
  }

  private StringBuilder getStars(int rating) {
    StringBuilder finalString = new StringBuilder();
    for (int i = 0; i < rating; i++) {
      finalString.append("★");
    }

    for (int i = 0; i < 5 - rating; i++) {
      finalString.append("☆");
    }

    return finalString;
  }
}
