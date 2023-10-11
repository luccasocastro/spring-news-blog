package com.luxkapotter.springnewsblog.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.luxkapotter.springnewsblog.models.FeedItem;
import com.luxkapotter.springnewsblog.services.FeedItemService;

@Controller
public class HomeController {
    private FeedItemService feedItemService;

    public HomeController(FeedItemService feedItemService) {
        this.feedItemService = feedItemService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<FeedItem> feedItems = feedItemService.getAll();
        model.addAttribute("feedItems", feedItems);
        return "index";
    }
}
