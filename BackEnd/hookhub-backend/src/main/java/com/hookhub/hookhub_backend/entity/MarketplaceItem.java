package com.hookhub.hookhub_backend.entity;

import com.hookhub.hookhub_backend.enums.Condition;
import com.hookhub.hookhub_backend.enums.SaleStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "marketplaceItems")
public class MarketplaceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "user_ID")
    private User users;
    @ManyToOne
    @JoinColumn(name = "gear_ID")
    private Gear gear;
    private double price;
    private Condition condition;
    private SaleStatus status;
}
