package pl.mpas.mp3_repository.service;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import pl.mpas.mp3_repository.dao.AlbumDao;
import pl.mpas.mp3_repository.model.Album;
import pl.mpas.mp3_repository.model.Performer;

import java.time.Year;
import java.util.List;
import java.util.stream.Collectors;

public class AlbumServiceImpl implements AlbumService {
    private AlbumDao albumDao;

    public AlbumServiceImpl(AlbumDao albumDao) {
        this.albumDao = albumDao;
    }

    @Override
    public String toString() {
        return "AlbumServiceImpl{" +
                "albumDao=" + albumDao +
                '}';
    }

    @Override
    public AlbumCreationResult createNewAlbum(Album newAlbum) {
        Preconditions.checkNotNull(newAlbum, "[newAlbum] cannot be null!");
        if (albumDao.checkAlbumExists(newAlbum)) {
            return AlbumCreationResult.ALREADY_EXISTS;
        }
        boolean savingResult = albumDao.saveNewAlbum(newAlbum);
        if (savingResult) {
            return AlbumCreationResult.SUCCESS;
        } else {
            return AlbumCreationResult.FAILED;
        }
    }

    @Override
    public boolean deleteAlbum(Album album) {
        Preconditions.checkNotNull(album,"[album] cannot be null");
        return albumDao.deleteAlbum(album);
    }

    @Override
    public Album updateAlbum(Album updated) {
        Preconditions.checkNotNull(updated, "[updated] cannot be null!");
        return albumDao.updateAlbum(updated);
    }

    @Override
    public List<Album> findAllAlbums() {
        return albumDao.readAllAlbums();
    }

    @Override
    public List<Album> findAlbumsFromCategory(String category) {
        if (Strings.isNullOrEmpty(category)) {
            throw new IllegalArgumentException("[category] cannot be null!");
        }

        return albumDao.readAllAlbums().stream()
                .filter(album -> album.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    @Override
    public List<Album> findAlbumsOfGivenPerformer(Performer performer) {
        Preconditions.checkNotNull(performer, "[performer] cannot be null!");
        return albumDao.readAlbumsOfGivenPerformer(performer);
    }

    @Override
    public List<Album> findAlbumsFromGivenYear(Year year) {
        Preconditions.checkNotNull(year, "[year] cannot be null!");
        return albumDao.readAlbumsFromGivenYear(year);
    }

    @Override
    public List<Album> findFavoriteAlbums() {
        // TODO: add logs
        return albumDao.readFavoriteAlbums();
    }
}
