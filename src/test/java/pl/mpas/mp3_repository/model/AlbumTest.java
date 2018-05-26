package pl.mpas.mp3_repository.model;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Collections;

public class AlbumTest {

    @Rule
    public final ExpectedException ruleException = ExpectedException.none();

    @Test
    public void creationAlbum_success() {
        Album newAlbum = new Album(Collections.emptyList(), "Piosenki ludowe", new Performer());
        Assert.assertNotNull("Problem occured during creation of new album", newAlbum);
    }

    @Test
    public void creationAlbum_nullSongsList() {
        try {
            Album newAlbum = new Album(null, "Piosenki ludowe", new Performer());
            Assert.fail("Shouldn't reach here!!!");
        } catch (NullPointerException ex) {
            Assert.assertTrue(true);
        }
    }

    @Test(expected = NullPointerException.class)
    public void creationAlbum_nullSongsList_withExpected() {
        Album newAlbum = new Album(null, "Piosenki ludowe", new Performer());
    }

    @Test
    public void creationAlbum_nullSongsList_withRule() {
        ruleException.expect(NullPointerException.class);
        ruleException.expectMessage("[listOfSongs] cannot be null!");

        Album newAlbum = new Album(null, "Piosenki ludowe", new Performer());
    }

    @Test
    public void creationAlbum_emptyTitle() {

    }

    @Test
    public void creationAlbum_nullPerformer() {

    }
}
