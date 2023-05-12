import animals.*;

import java.util.Date;
import java.util.logging.LogManager;
import java.util.logging.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        log.info("Loading lions...");

        TailedAnimal l1 = new Lion("Gennaro", "carne di Zebra", 5, new Date(), 180, 120, 80);
        TailedAnimal l2 = new Lion("Ciro", "carne di Gnu", 8, new Date(), 185, 100, 75);
        TailedAnimal l3 = new Lion("Chanel", "carne di Gazzella", 8, new Date(), 110, 100, 77);


        log.info("Loading tigers...");

        TailedAnimal t1 = new Tiger("Rihanna", "carne di Cinghiale", 10, new Date(), 150, 200, 95);
        TailedAnimal t2 = new Tiger("Jessica", "carne di Cervo", 13, new Date(), 175, 225, 85);
        TailedAnimal t3 = new Tiger("Ludovico", "carne di Cinghiale", 16, new Date(), 200, 295, 90);


        log.info("Loading eagles...");

        WingedAnimal e1 = new Eagle("Jayson", "carne di Volpe", 34, new Date(), 4, 90, 200);
        WingedAnimal e2 = new Eagle("Letizia", "carne di Coniglio", 10, new Date(), 3, 70, 190);
        WingedAnimal e3 = new Eagle("Tommaso", "carne di Lepre", 18, new Date(), 3, 85, 210);


        log.info("Loading done");

        System.out.println("Lion name: "+l1.getName()+" - Tail length: "+l1.getTailLength()+" (expected: 80)");

    }
}