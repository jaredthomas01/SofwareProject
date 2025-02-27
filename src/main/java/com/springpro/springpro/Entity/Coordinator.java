package com.springpro.springpro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Coordinator")
public class Coordinator {

    @Id
    @Column(name = "CoordinatorID")
    private int id;

    @Column(name = "CoordinatorName")
    private String name;

//    Getters and setters

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
}
