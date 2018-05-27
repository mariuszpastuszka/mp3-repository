package pl.mpas.mp3_repository.service;

import pl.mpas.mp3_repository.model.Album;
import pl.mpas.mp3_repository.model.RaitingStars;
import pl.mpas.mp3_repository.model.Song;

public interface RatingService {
    public void rateAlbum(Album album, RaitingStars myRaiting);
    public void rateAlbumWithComment(Album album, RaitingStars myRaiting, String myComment);
    public void deleteAlbumRaiting(Album album);
    public void deleteAlbumComment(Album album);
    public void deleteAlbumRaitingAndComment(Album album);

    public void rateSong(Song whichSong, RaitingStars myRaiting);
    public void rateSongWithComment(Song whichSong, RaitingStars myRaiting);
    public void deleteSongRaiting(Song song);
    public void deleteSongComment(Song song);
    public void deleteSongRaitingAndComment(Song song);
}
