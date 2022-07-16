package com.codelegion.Code.Legion.models.articles;

import com.codelegion.Code.Legion.models.articles.elements.ElementArticle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;
    private String fullText;
    /*constructors*/
    public Post(){}
    public Post(String title) {
        this.title = title;
    }
    public Post(String title, String description) {
        this.description = description;
        this.title = title;
    }
    /*getters*/
    /*setters*/
    /*system*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id.equals(post.id) && title.equals(post.title) && description.equals(post.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, title, description);
    }
    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
