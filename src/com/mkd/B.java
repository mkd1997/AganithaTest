package com.mkd;

public class B extends X{
    private static int classExecuteCount = 0;
    private int objectExecuteCount;

    B(String name) {
        this.objectExecuteCount = 0;
        this.init(name);
    }

    public void execute() {
        B.classExecuteCount++;
        this.objectExecuteCount++;
        System.out.println(this.getName());
        System.out.println(this.getClass().getName());
        System.out.println(this.objectExecuteCount);
        System.out.println(B.classExecuteCount);
    }
}
