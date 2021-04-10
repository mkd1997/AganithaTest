package com.mkd;

public class A extends X {
    private static int classExecuteCount = 0;
    private int objectExecuteCount;

    A(String name) {
        this.objectExecuteCount = 0;
        this.init(name);
    }

    public void execute() {
        A.classExecuteCount++;
        this.objectExecuteCount++;
        System.out.println(this.getName());
        System.out.println(this.getClass().getName());
        System.out.println(this.objectExecuteCount);
        System.out.println(A.classExecuteCount);
    }
}
