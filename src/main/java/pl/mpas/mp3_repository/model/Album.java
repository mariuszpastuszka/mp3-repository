package pl.mpas.mp3_repository.model;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import java.io.File;
import java.time.LocalDate;
import java.util.List;

public class Album {
    Performer performer;
    LocalDate publicationDate;
    String phonographicPublication;
    String publisher;
    String category;
    File albumCover;
    double price;
    Evaluation albumEvaluation;
    String opinion;
    MediaType mediaType;
    private List<Song> listOfSongs;
    private String title;

    // TODO: fix initialization of fields
    public Album(List<Song> listOfSongs, String title, Performer performer) {
        this.listOfSongs = Preconditions.checkNotNull(listOfSongs, "[listOfSongs] cannot be null!");
        if (Strings.isNullOrEmpty(title)) {
            throw new IllegalArgumentException("[title] cannot be empy or null!");
        }
        this.title = title;
        this.performer = Preconditions.checkNotNull(performer, "[performer] cannot be null");
    }

    public Album() {
    }

    public Album(List<Song> listOfSongs, String title, Performer performer, LocalDate publicationDate, String phonographicPublication, String publisher, String category, File albumCover, double price, Evaluation albumEvaluation, String opinion, MediaType mediaType) {
        this(listOfSongs, title, performer);
        this.publicationDate = publicationDate;
        this.phonographicPublication = phonographicPublication;
        this.publisher = publisher;
        this.category = category;
        this.albumCover = albumCover;
        this.price = price;
        this.albumEvaluation = albumEvaluation;
        this.opinion = opinion;
        this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        return "Album{" +
                "performer=" + performer +
                ", publicationDate=" + publicationDate +
                ", phonographicPublication='" + phonographicPublication + '\'' +
                ", publisher='" + publisher + '\'' +
                ", category='" + category + '\'' +
                ", albumCover=" + albumCover +
                ", price=" + price +
                ", albumEvaluation=" + albumEvaluation +
                ", opinion='" + opinion + '\'' +
                ", mediaType=" + mediaType +
                ", listOfSongs=" + listOfSongs +
                ", title='" + title + '\'' +
                '}';
    }
}
