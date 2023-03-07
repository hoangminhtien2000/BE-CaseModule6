package com.becasemodule6.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Favourite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Account account;

    @ManyToOne
    private Song song;

}
