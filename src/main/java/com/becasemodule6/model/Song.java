package com.becasemodule6.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String lyrics;

    @ManyToOne
    private Singer singer;

    @ManyToOne
    private Album album;

    private Instant created_at;
}
