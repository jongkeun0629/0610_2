package org.example;

import com.jongkeun.Test2;
import org.example.animal.Person;

class Helper{
    String helper = "helper";
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "이종근";
        person.age = 26;

        person.hello();

        Helper helper = new Helper();
        System.out.println(helper.helper);

        Test test = new Test();
        System.out.println(test.test);

        Test2 test2 = new Test2();
        System.out.println(test2.test2);

    }
}