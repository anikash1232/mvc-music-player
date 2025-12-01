module org.comp301.spotify.mvcspotify {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.comp301.spotify.mvcspotify to javafx.fxml;
    exports org.comp301.spotify.mvcspotify;
    exports org.comp301.spotify.mvcspotify.Controller;
    opens org.comp301.spotify.mvcspotify.Controller to javafx.fxml;
}