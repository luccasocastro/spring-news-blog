package com.luxkapotter.springnewsblog.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxkapotter.springnewsblog.services.FeedItemService;
import com.luxkapotter.springnewsblog.models.FeedItem;

@RestController
@RequestMapping("/feeditems")
public class FeedItemController {
    private FeedItemService feedItemService;

    public FeedItemController(FeedItemService feedItemService) {
        this.feedItemService = feedItemService;
    }
    
    @GetMapping
    public List<FeedItem> getAll(){
        return feedItemService.getAll();
    }

    @GetMapping("/{id}")
    public FeedItem findById(@PathVariable Long id){
        return feedItemService.getById(id);
    }
}
