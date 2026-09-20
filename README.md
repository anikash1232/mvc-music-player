# MVC Music Player

A Spotify-style music player in JavaFX, structured as a strict model-view-controller
application with multiple independent views over one shared model.

## What it does

Build a playlist, browse songs, and add new ones through a dedicated form. Each part of the
interface is its own view class observing the same model, so adding a song through one view
updates every other view without any of them referencing each other.

- Playlist view listing the current collection
- Song view rendering an individual track's details
- Add-song form for extending the playlist
- A single model holding song data, with views reacting to its changes

## Architecture

```
Model/
  Model        song collection and playlist state
  SongImpl     a track
View/
  PlaylistView   the collection
  SongView       one track's detail
  AddSongView    input form
Controller/
  Controller     routes input to the model

HelloApplication   JavaFX entry point
```

Views never talk to each other and never mutate state directly — they read from the model
and send user actions to the controller. That separation is what lets three views coexist
over one dataset without coordination code between them.

## Running it

Requires Java 17+ and Maven.

```bash
mvn clean javafx:run
```

## Credits

Built with [Arya](https://github.com/arya-pradhan) as an in-class pair exercise.
