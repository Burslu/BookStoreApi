package trendyolAPI.pojo.LaststeapProduct;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class DataProduct {

    @JsonProperty("id")
    public int id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("description")
    public String description;
    @JsonProperty("ean")
    public String ean;
    @JsonProperty("upc")
    public String upc;
    @JsonProperty("image")
    public String image;
    @JsonProperty("images")
    public ArrayList<Image> images;
    @JsonProperty("net_price")
    public double net_price;
    @JsonProperty("taxes")
    public String taxes;
    @JsonProperty("price")
    public String price;
    public ArrayList<String> categories;
    public ArrayList<String> tags;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    public double getNet_price() {
        return net_price;
    }

    public void setNet_price(double net_price) {
        this.net_price = net_price;
    }

    public String getTaxes() {
        return taxes;
    }

    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
}
