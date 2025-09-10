package SOLID5;

public class Main {
    public static void main(String[] args) {
        SimplePrinter printer = new SimplePrinter();
        printer.printDocument();

        MultiFunctionPrinter printer2 = new MultiFunctionPrinter();
        printer2.printDocument();
        printer2.scanDocument();
        printer2.faxDocument();
    }
}
