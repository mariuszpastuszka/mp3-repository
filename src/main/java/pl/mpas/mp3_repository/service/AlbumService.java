package pl.mpas.mp3_repository.service;

import pl.mpas.mp3_repository.model.Album;
import pl.mpas.mp3_repository.model.Performer;

import java.time.Year;
import java.util.List;

public interface AlbumService {
    public AlbumCreationResult createNewAlbum(Album newAlbum);
    public boolean deleteAlbum(Album album);
    public Album updateAlbum(Album updated);
    public List<Album> findAllAlbums();
    public List<Album> findAlbumsFromCategory(String category);
    public List<Album> findAlbumsOfGivenPerformer(Performer performer);
    public List<Album> findAlbumsFromGivenYear(Year year);
    public List<Album> findFavoriteAlbums();
}
