package com.example;

public class App {
    public static String greeting(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, DevOps! my name is harini";
        }
        return "Hello, " + name.trim() + "!";
    }

    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "DevOps";
        System.out.println(greeting(name));
    }
}
