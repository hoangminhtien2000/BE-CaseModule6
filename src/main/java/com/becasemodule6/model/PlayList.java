package com.becasemodule6.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PlayList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
