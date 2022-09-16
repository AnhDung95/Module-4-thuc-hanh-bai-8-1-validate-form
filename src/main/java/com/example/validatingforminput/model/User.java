package com.example.validatingforminput.model;

import javax.validation.constraints.*;

public class User {

    @NotNull
    @Size(min = 2, max = 30)
    @Pattern(regexp = "^[a-zA-Z]*",message = "Ten khach hang chi chua ky tu a-z hoac A-Z")
    private String name;

    @Min(18)
    @Max(50)
    private int age;

    public User() {
    }

    public User(@NotEmpty @Size(min = 2, max = 30) String name, @Min(18) @Max(50) int age) {
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
}
