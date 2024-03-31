package com.vedha.annotations.postMapping;

public class PostMappingDTO {

    private String name;

    private int age;

    public PostMappingDTO(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "PostMappingDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
