package com.example.exr_automappingdto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(name = "full_name", nullable = false)
    private String fullName;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Game> games = new ArrayList<>();

    private boolean isAdmin;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    public User(String email, String password, String fullName) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
    }
}
