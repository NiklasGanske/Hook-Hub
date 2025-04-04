package com.hookhub.hookhub_backend.entity;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Catch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_ID")
    private Long userId;
    private String species;
    private double weight;
    private double length;
    private String location;
    private LocalDateTime timeStamp;
    @ManyToOne
    @JoinColumn(name = "gear_ID")
    private Gear gear;

    @OneToMany(mappedBy = "catchEntity")
    private List<Post> posts;

}
