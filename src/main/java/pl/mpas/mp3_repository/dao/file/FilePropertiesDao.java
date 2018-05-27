package pl.mpas.mp3_repository.dao.file;

import pl.mpas.mp3_repository.dao.AlbumDao;
import pl.mpas.mp3_repository.model.Album;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class FilePropertiesDao implements AlbumDao {
    private static final String PROPERTIES_FILE_NAME = "albums.properties";

    private Properties fileProperties;

    public FilePropertiesDao() {
        fileProperties = new Properties();
        try {
            fileProperties.load(getClass().getClassLoader().getResourceAsStream("albums.properties"));
        } catch (IOException e) {
            e.printStackTrace();
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
        return null;
    }
}
