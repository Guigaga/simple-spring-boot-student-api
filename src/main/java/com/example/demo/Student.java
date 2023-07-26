package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "STUDENTS")
public class Student {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "MARK")
    private double mark;

    @Column(name = "NAME")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
