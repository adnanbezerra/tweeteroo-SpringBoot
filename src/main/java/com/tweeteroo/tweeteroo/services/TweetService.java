package com.tweeteroo.tweeteroo.services;

import com.tweeteroo.tweeteroo.dto.NewTweetDTO;
import com.tweeteroo.tweeteroo.model.Tweets;
import com.tweeteroo.tweeteroo.model.User;
import com.tweeteroo.tweeteroo.repository.TweetRepository;
import com.tweeteroo.tweeteroo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TweetService {
    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private UserRepository userRepository;

    public void saveTweet(@RequestBody NewTweetDTO req) {
        User user = userRepository.findByUsername(req.username());

        tweetRepository.save(new Tweets(req, user.getAvatar()));
    }

    public List<Tweets> findByUsername(String username) {
        return tweetRepository.findByUsername(username);
    }
}
