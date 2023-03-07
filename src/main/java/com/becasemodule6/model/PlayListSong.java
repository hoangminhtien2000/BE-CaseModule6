package com.becasemodule6.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PlayListSong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private PlayList playList;

   @ManyToOne
    private Song song;
}
