package com.OussamaDev.project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id  ;

    @Column(name ="order_name")
    private String name ;

    @Column(name ="order_address")
    private String address ;

    @Column(name ="order_email")
    private String email ;

    @Column(name ="order_telephone")
    private int telephone ;

    @Column(name ="order_quantity")
    private int quantity ;

    @Column(name ="order_price")
    private int price ;

    @Temporal(TemporalType.DATE)
    private Date date ;

    @Column(name ="order_status")
    private String status ;

    @ManyToOne(
            cascade = {
                    CascadeType.DETACH , CascadeType.MERGE,
                    CascadeType.PERSIST , CascadeType.PERSIST
            }
    )
    @JoinColumn(name ="buyer_id")
    @JsonIgnore
    private Buyer buyer ;

    @ManyToMany(
            fetch = FetchType.LAZY ,
            cascade = {
                    CascadeType.DETACH , CascadeType.PERSIST ,
                    CascadeType.MERGE , CascadeType.REFRESH
            }
    )
    @JoinTable(
            name = "order_detail" ,
            joinColumns = @JoinColumn(name="id_order") ,
            inverseJoinColumns = @JoinColumn(name="product_id")
    )
    private List<Product> products ;

    public Order(String name, String address, String email, int telephone, int quantity, int price, Date date, String status) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.status = status;
    }

    public Order() {

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void addOrders(Product product){
        if (products==null) products = new ArrayList<>( );
        products.add(product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", quantity=" + quantity +
                ", price=" + price +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
