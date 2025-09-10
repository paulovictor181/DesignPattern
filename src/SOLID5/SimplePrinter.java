package SOLID5;

import SOLID5.Interfaces.Printer;

public class SimplePrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("Printing document");
    }
}
