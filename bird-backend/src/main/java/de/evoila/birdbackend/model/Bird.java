package de.evoila.birdbackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "birds")
@Entity
public class Bird extends BaseEntity {

    private String name;
    private String color;
    private int weight;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name=" + name + ", color='" + color + " }";
    }
}
