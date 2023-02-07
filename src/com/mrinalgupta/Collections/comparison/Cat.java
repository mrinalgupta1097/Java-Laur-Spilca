package com.mrinalgupta.Collections.comparison;

public class Cat implements Comparable<Cat> {
    private int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
        // negative : if current object is smaller than parameter
        // 0 : if both are equal
        // positive : if current object is bigger than parameter
//        if (this.age < o.age)
//            return -1;
//        else if (this.age > o.age) {
//            return 1;
//        }
//        return 0;
        return this.age - o.age;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
