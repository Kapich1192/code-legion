package com.codelegion.Code.Legion.models.articles;

import com.codelegion.Code.Legion.models.articles.elements.ElementArticle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;
    private ArrayList<String> listElements;
    /*constructors*/
    /*getters*/
    /*setters*/


}
