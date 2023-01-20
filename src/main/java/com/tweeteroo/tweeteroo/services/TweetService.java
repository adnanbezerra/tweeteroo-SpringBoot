package com.tweeteroo.tweeteroo.services;

import com.tweeteroo.tweeteroo.dto.NewTweetDTO;
import com.tweeteroo.tweeteroo.model.Tweets;
import com.tweeteroo.tweeteroo.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TweetService {
    @Autowired
    private TweetRepository repository;

    public void saveTweet(@RequestBody NewTweetDTO req) {
        repository.save(new Tweets(req));
    }

    public List<Tweets> findByUsername(String username) {
        return repository.findByUsername(username);
    }
}
