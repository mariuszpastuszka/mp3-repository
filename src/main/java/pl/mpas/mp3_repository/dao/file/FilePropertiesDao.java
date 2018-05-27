package pl.mpas.mp3_repository.dao.file;

import pl.mpas.mp3_repository.dao.AlbumDao;
import pl.mpas.mp3_repository.model.Album;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class FilePropertiesDao implements AlbumDao {
    private static final String PROPERTIES_FILE_NAME = "albums.properties";

    private Properties fileProperties;
    private boolean initialized = false;
    List<Album> albums;

    public FilePropertiesDao() {
        fileProperties = new Properties();
        try {
            fileProperties.load(getClass().getClassLoader().getResourceAsStream("albums.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initAlbums() {
        if (!initialized) {
            initialized = true;
            albums = new ArrayList<>();
            // read albums from properties file
        }
    }
    public static void main(String[] args) {
        FilePropertiesDao propertiesDao = new FilePropertiesDao();
        propertiesDao.listPairs();
    }

    public void listPairs() {
        Enumeration<?> keys = fileProperties.propertyNames();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            System.out.println(key + ":" + fileProperties.getProperty(key));
        }
    }

    @Override
    public boolean saveNewAlbum(Album newAlbum) {
        initAlbums();
        return false;
    }

    @Override
    public boolean checkAlbumExists(Album existingOne) {
        return false;
    }

    @Override
    public Album updateAlbum(Album updated) {
        return null;
    }

    @Override
    public boolean deleteAlbum(Album toDelete) {
        return false;
    }

    @Override
    public List<Album> readAllAlbums() {
        initAlbums();
        return null;
    }
}
