package com.goanna.controller.Entity;

public class MyName {

    String name;

    public MyName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }

}
