package pl.mpas.mp3_repository.service;

import org.junit.Before;
import org.junit.Test;
import pl.mpas.mp3_repository.dao.AlbumDao;
import pl.mpas.mp3_repository.model.Album;
import pl.mpas.mp3_repository.model.Performer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;

public class AlbumServiceTest {

    AlbumDao albumDao;
    AlbumService albumService;
    List<Album> albums;
    Performer defaultPerformer;

    @Before
    public void init() {
        albumDao = mock(AlbumDao.class);
        albumService = new AlbumServiceImpl(albumDao);
        defaultPerformer = new Performer();

        albums = new ArrayList<>();
        albums.add(new Album(Collections.emptyList(), "Polskie hity", defaultPerformer));
        albums.add(new Album(Collections.emptyList(), "Rosyjskie hity", defaultPerformer));
    }

    @Test
    public void readAllAlbumsTest() {

        when(albumDao.readAllAlbums()).thenReturn(albums);
        System.out.println(albumService.findAllAlbums());
    }
}
