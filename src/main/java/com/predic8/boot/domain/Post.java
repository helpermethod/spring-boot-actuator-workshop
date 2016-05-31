package com.predic8.boot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @Lob
    private String body;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}