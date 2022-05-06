package com.example.streetapp.model.enity;

public class People {
    private String identification;
    private int age ;
    private String name  ;
    private String job;
    public People(String identification, int age, String name, String job) {
        this.identification = identification;
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public String getIdentification() {
        return identification;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
