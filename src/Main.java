import control.AnimalsController;
import domain.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        log.info("Loading lions...");

        TailedAnimal l1 = new Lion("Gennaro", "carne di Zebra", 5, LocalDate.of(2018, Month.DECEMBER, 19), 180, 1.20, 80);
        TailedAnimal l2 = new Lion("Ciro", "carne di Gnu", 8, LocalDate.of(2015, Month.NOVEMBER, 30), 185, 1.00, 75);
        TailedAnimal l3 = new Lion("Chanel", "carne di Gazzella", 8, LocalDate.of(2022, Month.JULY, 17), 110, 1.00, 77);

        log.info("Loading tigers...");

        TailedAnimal t1 = new Tiger("Rihanna", "carne di Cinghiale", 10, LocalDate.of(2018, Month.DECEMBER, 3), 150, 2.00, 95);
        TailedAnimal t2 = new Tiger("Jessica", "carne di Cervo", 13, LocalDate.of(2019, Month.APRIL, 24), 175, 2.25, 85);
        TailedAnimal t3 = new Tiger("Ludovico", "carne di Cinghiale", 16, LocalDate.of(2012, Month.FEBRUARY, 5), 200, 2.95, 90);

        log.info("Loading eagles...");

        WingedAnimal e1 = new Eagle("Jayson", "carne di Volpe", 34, LocalDate.of(2006, Month.JUNE, 25), 4.1, 0.90, 200);
        WingedAnimal e2 = new Eagle("Letizia", "carne di Coniglio", 10, LocalDate.of(2018, Month.DECEMBER, 3), 3.8, 0.70, 190);
        WingedAnimal e3 = new Eagle("Tommaso", "carne di Lepre", 18, LocalDate.of(2010, Month.JUNE, 21), 2.5, 0.85, 210);

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


        AnimalsController a = new AnimalsController(list);
        Animal tallestAnimal = a.findAnimalByMaxHeight();
        Animal shortestAnimal = a.findAnimalByMinHeight();
        Animal heaviestAnimal = a.findAnimalByMaxWeight();
        Animal lighterAnimal = a.findAnimalByMinWeight();
        TailedAnimal longestTailAnimal = a.findAnimalByLongestTail();
        WingedAnimal widestWingspanAnimal = a.findAnimalByWidestWingspan();

        System.out.println("Tallest animal found: "+tallestAnimal.getName()+" (expected: LUDOVICO)");
        System.out.println("Shortest animal found: "+shortestAnimal.getName()+" (expected: LETIZIA)");
        System.out.println("Heaviest animal found: "+heaviestAnimal.getName()+" (expected: LUDOVICO)");
        System.out.println("Lighter animal found: "+lighterAnimal.getName()+" (expected: TOMMASO)");
        System.out.println("Longest tail animal found: "+longestTailAnimal.getName()+" (expected: RIHANNA)");
        System.out.println("Widest wingspan animal found: "+widestWingspanAnimal.getName()+" (expected: TOMMASO)");
    }
}