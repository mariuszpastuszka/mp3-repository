package pl.mpas.mp3_repository.service;

import com.google.common.base.Preconditions;
import pl.mpas.mp3_repository.model.Album;
import pl.mpas.mp3_repository.model.RaitingStars;
import pl.mpas.mp3_repository.model.Song;

public class RaitingServiceImpl implements RatingService {
    private AlbumService albumService;

    public RaitingServiceImpl(AlbumService albumService) {
        this.albumService = albumService;
    }

    @Override
    public void rateAlbum(Album album, RaitingStars myRaiting) {
        // check input
        Preconditions.checkNotNull(album, "[album] cannot be null!");
        Preconditions.checkNotNull(myRaiting, "[myRaiting] cannot be null!");

        // set raiting in album
        album.setAlbumRaitingStars(myRaiting);

        // update album in dao
        albumService.updateAlbum(album);
    }

    @Override
    public void rateAlbumWithComment(Album album, RaitingStars myRaiting, String myComment) {

    }

    @Override
    public void deleteAlbumRaiting(Album album) {

    }

    @Override
    public void deleteAlbumComment(Album album) {

    }

    @Override
    public void deleteAlbumRaitingAndComment(Album album) {

    }

    @Override
    public void rateSong(Song whichSong, RaitingStars myRaiting) {

    }

    @Override
    public void rateSongWithComment(Song whichSong, RaitingStars myRaiting) {

    }

    @Override
    public void deleteSongRaiting(Song song) {

    }

    @Override
    public void deleteSongComment(Song song) {

    }

    @Override
    public void deleteSongRaitingAndComment(Song song) {

    }
}
