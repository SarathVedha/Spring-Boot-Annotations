package com.vedha.annotations.putmapping;

public class PutMappingDTO {

    private String name;

    private String age;

    public PutMappingDTO(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PutMappingDTO{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
