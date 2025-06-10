package org.example;

import com.jongkeun.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "이종근";
        person.age = 26;

        person.hello();
    }
}