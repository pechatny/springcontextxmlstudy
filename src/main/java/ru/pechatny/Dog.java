package ru.pechatny;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    public void sound() {
        System.out.println("Gav");
    }
}
