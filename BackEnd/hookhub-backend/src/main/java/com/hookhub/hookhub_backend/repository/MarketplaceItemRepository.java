package com.hookhub.hookhub_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hookhub.hookhub_backend.entity.MarketplaceItem;

public interface MarketplaceItemRepository extends JpaRepository<MarketplaceItem, Long> {

}
