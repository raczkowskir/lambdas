package org.example;

import java.util.function.Consumer;

public class RealPrinter implements Printer {
    @Override
    public void printRR(String title) {
        System.out.println(title);
    }

    static void printRRDefault(String title) {
        System.out.println(title);
    }

//    @Override
    public void accept(Object o) {
        if (o.getClass().equals("".getClass())) {
            System.out.println(o + " dziala");
        }
    }

}
