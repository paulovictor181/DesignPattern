package SOLID5;

import SOLID5.Interfaces.Fax;
import SOLID5.Interfaces.Printer;
import SOLID5.Interfaces.Scanner;

public class MultiFunctionPrinter implements Printer, Scanner, Fax {
    public void printDocument() {
        System.out.println("Printing document");
    }


    @Override
    public void faxDocument() {

    }

    @Override
    public void scanDocument() {

    }
}
