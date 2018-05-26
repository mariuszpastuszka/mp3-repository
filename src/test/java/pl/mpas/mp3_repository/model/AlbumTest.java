package pl.mpas.mp3_repository.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class AlbumTest {

    @Test
    public void creationAlbum_success() {
        Album newAlbum = new Album(Collections.emptyList(), "Piosenki ludowe", new Performer());
        Assert.assertNotNull("Problem occured during creation of new album", newAlbum);
    }

    @Test
    public void creationAlbum_nullSongsList() {

    }

    @Test
    public void creationAlbum_emptyTitle() {

    }

    @Test
    public void creationAlbum_nullPerformer() {

    }
}
