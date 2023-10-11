package com.luxkapotter.springnewsblog.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.luxkapotter.springnewsblog.models.FeedItem;
import com.luxkapotter.springnewsblog.repositories.FeedItemRepository;

@Service
public class FeedItemService {
    private FeedItemRepository feedItemRepository;

    public FeedItemService(FeedItemRepository feedItemRepository) {
        this.feedItemRepository = feedItemRepository;
    }

    public FeedItem save(FeedItem feedItem) {
        if(feedItem.getId() == null){
            feedItem.setCreatedAt(LocalDateTime.now());
        }
        feedItem.setUpdatedAt(LocalDateTime.now());
        return feedItemRepository.save(feedItem);
    }

    public List<FeedItem> getAll(){
        return feedItemRepository.findAll();
    }

    public FeedItem getById(Long id){
        return feedItemRepository.findById(id).get();
    }
}
