package ss10_dsa_list.bai_tap.bai1_arraylist;

import java.util.ArrayList;

public class MyListTest {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        MyList<Person> myListTest = new MyList<>(4);
        myListTest.ensureCapacity(5);
    }
}
