package pl.mpas.mp3_repository.service;

import pl.mpas.mp3_repository.model.Album;
import pl.mpas.mp3_repository.model.Performer;

import java.time.Year;
import java.util.List;

public class AlbumServiceImpl implements AlbumService {
    @Override
    public AlbumCreationResult createNewAlbum(Album newAlbum) {
        return null;
    }

    @Override
    public boolean deleteAlbum(Album album) {
        return false;
    }

    @Override
    public Album updateAlbum(Album updated) {
        return null;
    }

    @Override
    public List<Album> findAllAlbums() {
        return null;
    }

    @Override
    public List<Album> findAlbumsFromCategory(String category) {
        return null;
    }

    @Override
    public List<Album> findAlbumsOfGivenPerformer(Performer performer) {
        return null;
    }

    @Override
    public List<Album> findAlbumsFromGivenYear(Year year) {
        return null;
    }

    @Override
    public List<Album> findFavoriteAlbums() {
        return null;
    }
}
