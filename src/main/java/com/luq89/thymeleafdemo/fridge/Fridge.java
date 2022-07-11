package com.luq89.thymeleafdemo.fridge;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Fridge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String producerName;
    private DoorType doorType;

    public Fridge() {}

    public Fridge(String producerName, String doorType) {
        super();
        this.producerName = producerName;
        this.doorType = DoorType.valueOf(doorType);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "id=" + id +
                ", producerName='" + producerName + '\'' +
                ", doorType=" + doorType.getDisplayName() +
                '}';
    }
}
