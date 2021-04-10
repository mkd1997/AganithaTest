package com.mkd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, X> mapObj = new HashMap<>();
        X xObj = null;
        X tmpObj = null;
        Scanner sc = new Scanner(System.in);
        String choice = "0";
        boolean flag = false;
        String name = "";
        do {
            System.out.println("1. Create Object\n2. Delete Object\n3. Run execute method\n4. Quit\nEnter choice");
            choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("Enter Class (A/B/C)");
                    String className = sc.next();
                    System.out.println("Enter Name");
                    flag = false;
                    name = "";
                    do {
                        name = sc.next();
                        if (mapObj.containsKey(name) == false) {
                            flag = true;
                        } else {
                            System.out.println("Enter another name");
                        }
                    } while (flag == false);
                    switch (className) {
                        case "A":
                            xObj = new A(name);
                            break;
                        case "B":
                            xObj = new B(name);
                            break;
                        case "C":
                            xObj = new C(name);
                            break;
                    }
                    mapObj.put(name, xObj);
                    break;
                case "2":
                    name = "";
                    flag = false;
                    do {
                        name = sc.next();
                        if (mapObj.containsKey(name) == true) {
                            flag = true;
                        } else {
                            System.out.println("No object with this name\nEnter another name");
                        }
                    } while (flag == false);
                    tmpObj = mapObj.get(name);
                    mapObj.remove(name);
                    tmpObj = null;
                    break;
                case "3":
                    name = "";
                    flag = false;
                    System.out.println("Enter Name");
                    do {
                        name = sc.next();
                        if (mapObj.containsKey(name) == true) {
                            flag = true;
                        } else {
                            System.out.println("No object with this name\nEnter another name");
                        }
                    } while (flag == false);
                    tmpObj = mapObj.get(name);
                    tmpObj.execute();
                    break;
            }
        } while (choice.equals("4") == false);
    }
}
