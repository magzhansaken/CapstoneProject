package com.example.capstone.food_delivery_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="authusergroup")
public class AuthGroupEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name="authgroup",nullable = false)
    private String authgroup;

    public AuthGroupEntity() {
    }

    public AuthGroupEntity(Integer id, String authgroup) {
        this.id = id;
        this.authgroup = authgroup;
    }
}
