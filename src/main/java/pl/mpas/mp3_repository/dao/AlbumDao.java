package pl.mpas.mp3_repository.dao;

import pl.mpas.mp3_repository.model.Album;
import pl.mpas.mp3_repository.model.Performer;

import java.time.Year;
import java.util.List;

public interface AlbumDao {
    boolean saveNewAlbum(Album newAlbum);
    boolean checkAlbumExists(Album existingOne);
    Album updateAlbum(Album updated);
    boolean deleteAlbum(Album toDelete);
    List<Album> readAllAlbums();
//    List<Album> readAlbumsFromCategory(String category);
//    List<Album> readAlbumsOfGivenPerformer(Performer performer);
//    List<Album> readAlbumsFromGivenYear(Year year);
//    List<Album> readFavoriteAlbums();
}

