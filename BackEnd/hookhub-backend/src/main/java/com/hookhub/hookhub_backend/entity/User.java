package com.hookhub.hookhub_backend.entity;

import java.util.List;

import com.hookhub.hookhub_backend.enums.SkillLevel;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String email;
    private String password;
    private int points;
    @OneToMany(mappedBy = "users")
    private List<Gear> gears;
    @OneToMany(mappedBy = "users")
    private List<Catch> catches;
    @OneToMany(mappedBy = "users")
    private List<Post> posts;
    @OneToMany(mappedBy = "users")
    private List<MarketplaceItem> marketplaceItem;
    @Enumerated(EnumType.STRING)
    private SkillLevel skillLevel;
}
