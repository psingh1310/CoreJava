package com.prashant;

public class Main {

    public static void main(String[] args) {
	 Printer printer = new Printer(50,true);
        System.out.println("Initial page count = " + printer.getPagePrinted());
        int pagePrinted = printer.printPages(4);
        System.out.println("PagesPrinted was " + pagePrinted + "new total print" +
                "count for printer " +printer.getPagePrinted());
        pagePrinted = printer.printPages(5);
        System.out.println("PagesPrinted was " + pagePrinted + "new total print" +
                "count for printer " +printer.getPagePrinted());

    }
}
