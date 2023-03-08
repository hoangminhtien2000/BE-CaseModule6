package com.becasemodule6.Services.song;

import com.becasemodule6.models.Song;
import com.becasemodule6.repositories.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService {
    @Autowired
    SongRepo songRepo;

    @Override
    public List<Song> findAll() {
        return (List<Song>) songRepo.findAll();
    }

    @Override
    public void save(Song song) {
        songRepo.save(song);
    }

    @Override
    public void delete(Long id) {
        songRepo.deleteById(id);
    }

    @Override
    public Song findById(Long id) {
        return songRepo.findById(id).get();
    }
}
