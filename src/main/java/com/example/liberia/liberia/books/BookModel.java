package com.example.liberia.liberia.books;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book")
public class BookModel {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable=false)
    private String title;

    @Column(nullable=false)
    private int isbnNo;

    @Column(nullable = false)
    private String description ;

    @Column(nullable = false)
    private String edition ;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private String language;

    @Column(nullable = false)
    private String[] author;

    @Column(nullable = false)
    private float mrp;

    private float price;

    @Column(nullable = false)
    private int pages;

    private int discount=0;

    private int quantity = 1;

    private boolean isActive = true;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date timestamp;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updated;


    //Constructors

    public BookModel(){}

    public BookModel(String title, int isbnNo, String description, String edition, String genre, String language, String[] author, float mrp, float price, int pages, int discount,int quantity) {

        this.title = title;
        this.isbnNo = isbnNo;
        this.description = description;
        this.edition = edition;
        this.genre = genre;
        this.language = language;
        this.author = author;
        this.mrp = mrp;
        this.price = price;
        this.pages = pages;
        this.discount = discount;
        this.quantity = quantity;

    }

    //Getters And Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(int isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public float getMrp() {
        return mrp;
    }

    public void setMrp(float mrp) {
        this.mrp = mrp;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }


    @PrePersist
    public void created()
    {
        timestamp = updated = new Date();
    }

    @PostPersist
    public void updated()
    {
        updated = new Date();
    }

}
