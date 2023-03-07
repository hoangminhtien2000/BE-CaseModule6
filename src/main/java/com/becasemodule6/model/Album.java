package com.becasemodule6.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Singer singer;
}
