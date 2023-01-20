package com.tweeteroo.tweeteroo.controllers;

import com.tweeteroo.tweeteroo.dto.NewTweetDTO;
import com.tweeteroo.tweeteroo.model.Tweets;

import com.tweeteroo.tweeteroo.services.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void getTweetsWithPagination(@RequestParam int page) {
        // TODO
    }

    @GetMapping("/{username}")
        public List<Tweets> findByUsername(@PathVariable String username) {
            return service.findByUsername(username);
        }
}
