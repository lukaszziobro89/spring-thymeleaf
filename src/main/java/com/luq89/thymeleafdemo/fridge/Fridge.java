package com.luq89.thymeleafdemo.fridge;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Fridge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String producerName;
    @Enumerated(EnumType.STRING)
    private DoorType doorType;

    public Fridge() {}

    public Fridge(String producerName, String doorType) {
        super();
        this.producerName = producerName;
        this.doorType = DoorType.valueOf(doorType);
    }
}
