package com.mkd;

public class C extends X {
    private static int classExecuteCount = 0;
    private int objectExecuteCount;

    C(String name) {
        this.objectExecuteCount = 0;
        this.init(name);
    }

    public void execute() {
        C.classExecuteCount++;
        this.objectExecuteCount++;
        System.out.println(this.getName());
        System.out.println(this.getClass().getName());
        System.out.println(this.objectExecuteCount);
        System.out.println(C.classExecuteCount);
    }
}
