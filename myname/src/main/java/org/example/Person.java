package org.example;

import java.util.Objects;

public class Person {
    String name;
    String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person name1 = (Person) o;
        return Objects.equals(name, name1.name) && Objects.equals(lastName, name1.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}