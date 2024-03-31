package com.vedha.annotations.restcontroller;

import java.util.List;

public class RestControllerDTO {

    private String name;

    private int age;

    private boolean isMarried;

    private List<String> kids;

    public RestControllerDTO(String name, int age, boolean isMarried, List<String> kids) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.kids = kids;
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

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public List<String> getKids() {
        return kids;
    }

    public void setKids(List<String> kids) {
        this.kids = kids;
    }
}
