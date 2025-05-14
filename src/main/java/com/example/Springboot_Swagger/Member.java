package com.example.Springboot_Swagger;

public class Member {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Member(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    int id;
    int age;
    String name;

}
