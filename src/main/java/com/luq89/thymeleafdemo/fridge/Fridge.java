package com.luq89.thymeleafdemo.fridge;

import com.luq89.thymeleafdemo.product.Product;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Fridge")
@Getter
@Setter
public class Fridge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String producerName;
    @Enumerated(EnumType.STRING)
    private DoorType doorType;

    @OneToMany(mappedBy = "fridge", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "fp_fk", referencedColumnName = "id")
    private List<Product> products;

    public Fridge() {}

    public Fridge(String producerName, String doorType) {
        super();
        this.producerName = producerName;
        this.doorType = DoorType.valueOf(doorType);
    }

    public Fridge(String producerName, DoorType doorType) {
        this.producerName = producerName;
        this.doorType = doorType;
    }
}
