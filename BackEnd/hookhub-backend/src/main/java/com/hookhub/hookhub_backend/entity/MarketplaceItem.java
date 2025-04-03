package com.hookhub.hookhub_backend.entity;

import java.util.concurrent.locks.Condition;

import com.hookhub.hookhub_backend.enums.SaleStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarketplaceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private Long userId;
    private Long gearId;
    private double price;
    private Condition condition;
    private SaleStatus status;
}
