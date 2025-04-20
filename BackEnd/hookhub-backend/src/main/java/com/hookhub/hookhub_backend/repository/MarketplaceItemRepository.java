package com.hookhub.hookhub_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hookhub.hookhub_backend.entity.MarketplaceItem;
import java.util.Optional;

public interface MarketplaceItemRepository extends JpaRepository<MarketplaceItem, Long> {
    @SuppressWarnings("null")
    Optional<MarketplaceItem> findById(Long id);
}
