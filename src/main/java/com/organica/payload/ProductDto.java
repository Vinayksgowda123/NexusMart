package com.organica.payload;

public class ProductDto {
    private int productId;
    private String productName;
    private String description;
    private Float price;
    private Float weight;
    private byte[] img;

    public ProductDto() {
    }

    public ProductDto(int productId, String productName, String description, Float price, Float weight, byte[] img) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.weight = weight;
        this.img = img;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", imgLength=" + (img == null ? 0 : img.length) +
                '}';
    }
}