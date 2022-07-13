package com.codelegion.Code.Legion.repo;

import com.codelegion.Code.Legion.models.articles.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
