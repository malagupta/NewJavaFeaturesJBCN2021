package com.jetbrains.records;

import java.io.Serializable;

public record Person(String name, int age) implements Serializable {
    public Person(String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
            this.age = age;
        }

    }

}
