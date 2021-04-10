package com.mkd;

import java.util.Map;

public abstract class X {
    private String name;

    public void init(String name) {
        this.name = name;
    }

    public abstract void execute();

    public void shutdown() {
        System.out.println("Shutting down!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
