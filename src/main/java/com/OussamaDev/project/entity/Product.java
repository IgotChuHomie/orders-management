package com.OussamaDev.project.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_product")
    private int id ;

    @Column(name ="product_name")
    private String name ;

    @Column(name ="product_price")
    private int price ;

    @Column(name ="product_stock")
    private int stock ;

    @Column(name ="product_image")
    private String image ;

    @Column(name ="product_description")
    private String description ;

    @ManyToMany(
            fetch = FetchType.LAZY ,
            cascade = {
                    CascadeType.DETACH , CascadeType.PERSIST ,
                    CascadeType.MERGE , CascadeType.REFRESH
            }
    )
    @JoinTable(
            name = "order_detail" ,
            joinColumns = @JoinColumn(name="product_id") ,
            inverseJoinColumns = @JoinColumn(name="id_order")
    )
    private List<Order> orders ;

    @OneToOne(cascade = {
            CascadeType.DETACH , CascadeType.PERSIST ,
            CascadeType.MERGE  , CascadeType.REFRESH
    })

    @JoinColumn(name ="id_category")
    private Category category ;

    public Product() {

    }

    public Product(int id, String name, int price, int stock, String image, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.image = image;
        this.description = description;
    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void addOrders(Order order){
        if (orders==null) orders = new ArrayList<>( );
        orders.add(order);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
