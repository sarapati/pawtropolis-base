import utils.AnimalsUtils;
import domain.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
        WingedAnimal e3 = new Eagle("Tommaso", "carne di Lepre", 18, new Date(), 2, 85, 210);


        log.info("Loading done");

        System.out.println("Lion name: "+l1.getName()+" - Tail length: "+l1.getTailLength()+" (expected: 80)");

        List<Animal> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(e1);
        list.add(e2);
        list.add(e3);


        AnimalsUtils a = new AnimalsUtils(list);
        Animal res1 = a.findAnimalByMaxHeight();
        Animal res2 = a.findAnimalByMinHeight();
        Animal res3 = a.findAnimalByMaxWeight();
        Animal res4 = a.findAnimalByMinWeight();
        TailedAnimal res5 = a.findAnimalByLongestTail();
        WingedAnimal res6 = a.findAnimalByWidestWingspan();

        System.out.println("Tallest animal found: "+res1.getName()+" (expected: LUDOVICO)");
        System.out.println("Shortest animal found: "+res2.getName()+" (expected: LETIZIA)");
        System.out.println("Heaviest animal found: "+res3.getName()+" (expected: LUDOVICO)");
        System.out.println("Lighter animal found: "+res4.getName()+" (expected: TOMMASO)");
        System.out.println("Longest tail animal found: "+res5.getName()+" (expected: RIHANNA)");
        System.out.println("Widest wingspan animal found: "+res6.getName()+" (expected: TOMMASO)");
    }
}