package com.tweeteroo.tweeteroo.controllers;

import com.tweeteroo.tweeteroo.dto.NewTweetDTO;
import com.tweeteroo.tweeteroo.model.Tweets;
import com.tweeteroo.tweeteroo.repository.TweetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
    private TweetRepository repository;

    @PostMapping
    public void postTweet(@RequestBody NewTweetDTO req) {
        repository.save(new Tweets(req));
    }

    @GetMapping
    public void getTweetsWithPagination(@RequestBody int page) {}
}
