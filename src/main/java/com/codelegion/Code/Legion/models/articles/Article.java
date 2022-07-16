package com.codelegion.Code.Legion.models.articles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*CREATE TABLE `article` VALUES (`id` INT NOT NULL AUTOINCREMENT,
                                    `title` VARCHAR(100),
                                    `description` TEXT,
                                    `fullText` TEXT,
                                    PRIMARY KEY (`id`)
                                );*/
    private Long id;
    private String title;
    private String description;
    private String fullText;
    /*constructors*/
    public Article(){}
    public Article(String title) {
        this.title = title;
    }
    public Article(String title, String description) {
        this.description = description;
        this.title = title;
    }
    /*getters*/
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    /*setters*/
    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    /*system*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return id.equals(article.id) && title.equals(article.title) && description.equals(article.description) ;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, title, description);
    }
    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
