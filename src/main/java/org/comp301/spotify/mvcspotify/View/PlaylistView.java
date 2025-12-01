package org.comp301.spotify.mvcspotify.View;

import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import org.comp301.spotify.mvcspotify.Controller.Controller;
import org.comp301.spotify.mvcspotify.Model.Model;

public class PlaylistView implements FXComponent {
  private final Model model;
  private final Controller controller;

  public PlaylistView(Model model, Controller controller) {
    this.model = model;
    this.controller = controller;
  }

  @Override
  public Parent render() {
    VBox layout = new VBox();

    for (int song = 0; 0 < this.model.getNumSongs(); song++) {
      SongView songView = new SongView(model, controller, song);
      layout.getChildren().add(songView.render());
    }

    return layout;
  }
}
