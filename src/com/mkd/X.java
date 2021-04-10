package com.mkd;

import java.util.Map;

public abstract class X {
    private String name;

    public void init(String name) {
        this.name = name;
    }

    public void execute() {
        System.out.println(this.name);
        System.out.println(this.getClass().getName());
    }

    public void shutdown() {
        System.out.println("Shutting down!");
    }
}
