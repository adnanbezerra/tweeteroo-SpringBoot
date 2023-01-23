package com.tweeteroo.tweeteroo.services;

import com.tweeteroo.tweeteroo.dto.NewTweetDTO;
import com.tweeteroo.tweeteroo.model.Tweets;
import com.tweeteroo.tweeteroo.model.Users;
import com.tweeteroo.tweeteroo.repository.TweetRepository;
import com.tweeteroo.tweeteroo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
        Users user = userRepository.findByUsername(req.username());

        tweetRepository.save(new Tweets(req, user.getAvatar()));
    }

    public List<Tweets> findByUsername(String username) {
        return tweetRepository.findByUsername(username);
    }

    public Page<Tweets> getTweets(Pageable page) {
        return tweetRepository.findAllByOrderByIdDesc(page);
    }
}
