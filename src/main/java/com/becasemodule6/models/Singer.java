package com.becasemodule6.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String full_name;

    private String gender;

    private int age;

//    - Tên
//- Giới tính
//- Ngày sinh
//- Dòng nhạc
//- Tiểu sử
//- Năm sinh
//- Band nhạc
//- Bài hát nổi bật
//- Thông tin thêm
}
