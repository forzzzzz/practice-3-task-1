package org.example;

public class SomeNewClass implements Displayable {
    private final String data;

    public SomeNewClass(String data) {
        this.data = data;
    }

    @Override
    public void display() {
        System.out.println("Data: " + data);
    }
}