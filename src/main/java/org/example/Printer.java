package org.example;

@FunctionalInterface
public interface Printer {

    void printRR(String title);
    static void printRRStatic(String title) {
        System.out.println("Title:" + title);
    }
    static void printRRDefault(String title) {
        System.out.println("Title:" + title);
    }


}
