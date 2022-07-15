package com.codelegion.Code.Legion.controllers.blogController;

import com.codelegion.Code.Legion.models.articles.Article;
import com.codelegion.Code.Legion.repo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @Autowired
    private ArticleRepository articleRepository;
    @GetMapping("/blog")
    public String blogMain(Model model) {
        Iterable<Article> articles = articleRepository.findAll();
        return "pages/blog";
    }

}
