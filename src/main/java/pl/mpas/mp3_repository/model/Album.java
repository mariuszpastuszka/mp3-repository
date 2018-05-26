package pl.mpas.mp3_repository.model;

import java.io.File;
import java.time.LocalDate;
import java.util.List;

public class Album {
    List<Song> listOfSongs;
    String title;
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
}
