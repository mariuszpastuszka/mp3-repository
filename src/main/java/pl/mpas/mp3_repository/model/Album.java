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

    public Performer getPerformer() {
        return performer;
    }

    public void setPerformer(Performer performer) {
        this.performer = performer;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPhonographicPublication() {
        return phonographicPublication;
    }

    public void setPhonographicPublication(String phonographicPublication) {
        this.phonographicPublication = phonographicPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public File getAlbumCover() {
        return albumCover;
    }

    public void setAlbumCover(File albumCover) {
        this.albumCover = albumCover;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Evaluation getAlbumEvaluation() {
        return albumEvaluation;
    }

    public void setAlbumEvaluation(Evaluation albumEvaluation) {
        this.albumEvaluation = albumEvaluation;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public List<Song> getListOfSongs() {
        return listOfSongs;
    }

    public void setListOfSongs(List<Song> listOfSongs) {
        this.listOfSongs = listOfSongs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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
