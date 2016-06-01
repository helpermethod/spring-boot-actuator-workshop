package com.predic8.boot.domain;

import javax.persistence.*;
import java.util.Date;

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
    private Date dateCreated;

    @PrePersist
    private void setDateCreated() {
        dateCreated = new Date();
    }

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

    public Date getDateCreated() {
        return new Date(dateCreated.getTime());
    }
}