package com.avenue.entity;

import javax.persistence.*;

@Entity
public class Image {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String url;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Product owner;

    public Image() {
    }

    public Image(Long id, String url) {
        this.id = id;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Product getOwner() {
        return owner;
    }

    public void setOwner(Product owner) {
        this.owner = owner;
    }
}