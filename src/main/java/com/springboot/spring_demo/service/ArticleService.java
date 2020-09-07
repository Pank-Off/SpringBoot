package com.springboot.spring_demo.service;

import com.springboot.spring_demo.dao.ArticleRepository;
import com.springboot.spring_demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository repository;

    public void save(Article article) {
        repository.save(article);
    }

}
