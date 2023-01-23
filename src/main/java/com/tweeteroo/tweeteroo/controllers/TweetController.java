package com.tweeteroo.tweeteroo.controllers;

import com.tweeteroo.tweeteroo.dto.NewTweetDTO;
import com.tweeteroo.tweeteroo.model.Tweets;

import com.tweeteroo.tweeteroo.services.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
    private TweetService service;

    @PostMapping
    public void postTweet(@RequestBody NewTweetDTO req) {
        service.saveTweet(req);
    }

    @GetMapping
    public Page<Tweets> getLastFiveTweets(@RequestParam String page) {
        int pageNumber = Integer.parseInt(page);
        Pageable sortedByIdDesc = PageRequest.of(pageNumber, 5, Sort.by("id").descending());
        return service.getTweets(sortedByIdDesc);
    }

    @GetMapping("/{username}")
    public List<Tweets> findByUsername(@PathVariable String username) {
        return service.findByUsername(username);
    }
}
