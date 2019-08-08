package com.codegym.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;


public class ProductForm {

    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    private MultipartFile image;
    private String name;
    private Double price;
    private Double quantity;
    private String description;
    private Integer active;

    public ProductForm() {}

    public ProductForm(Date createDate, MultipartFile image, String name, Double price, Double quantity, String description, Integer active) {
        this.createDate = createDate;
        this.image = image;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.active = active;

    }

    public ProductForm(Long id, Date createDate, MultipartFile image, String name, Double price, Double quantity, String description, Integer active) {
        this.id = id;
        this.createDate = createDate;
        this.image = image;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}
