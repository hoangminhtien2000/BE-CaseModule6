package com.becasemodule6.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gmail", columnDefinition = "VARCHAR(50)", unique = true)
    private String gmail;

    private String password;

    private String full_name;

    private String gender;

    private int age;

    private String address;

    private String phone_number;

    @Column(name = "avatar", columnDefinition = "LONGTEXT")
    private String avatar;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;


}
