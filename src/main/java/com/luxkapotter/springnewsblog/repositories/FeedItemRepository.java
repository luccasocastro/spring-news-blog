package com.luxkapotter.springnewsblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luxkapotter.springnewsblog.models.FeedItem;

@Repository
public interface FeedItemRepository extends JpaRepository<FeedItem, Long>{
    
}
