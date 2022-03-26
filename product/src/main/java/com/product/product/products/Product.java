package com.product.product.products;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Product {
    @Id
    @SequenceGenerator(
            name= "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long id;
    private String name;
    private Integer price;
    private Integer quantity;
    private LocalDate created;

    public Product() {
    }

    public class product {
        private Long id;
        private String name;
        private Integer price;
        private Integer quantity;
        private LocalDate created;

        public product(Long id, String name, Integer price, Integer quantity, LocalDate created) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.created = created;
        }

        public product(String name, Integer price, Integer quantity, LocalDate created) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.created = created;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public LocalDate getCreated() {
            return created;
        }

        public void setCreated(LocalDate created) {
            this.created = created;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    ", created=" + created +
                    '}';
        }
    }


    public Product(Long id, String name, Integer price, Integer quantity, LocalDate created) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.created = created;
    }

    public Product(String name, Integer price, Integer quantity, LocalDate created) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", created=" + created +
                '}';
    }
}
