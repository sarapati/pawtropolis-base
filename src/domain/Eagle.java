package domain;

import java.time.LocalDate;
import java.util.Date;

// T.T ieri ha perso

/**
 * Classe che definisce l'animale "aquila".
 * Estende WingedAnimal
 */
public class Eagle extends WingedAnimal {
    public Eagle() {
    }
    public Eagle(String name, String favFood, int age, LocalDate joinedIn, double weight, double height, float wingspan){
        super(name, favFood, age, joinedIn, weight, height, wingspan);
    }

    @Override
    public String toString() {
        return "Eagle{"+
            "name='" + super.getName() + '\'' +
                    ", favFood='" + super.getFavFood() + '\'' +
                    ", age=" + super.getAge() +
                    ", joinedIn=" + super.getJoinedIn() +
                    ", weight=" + super.getWeight() +
                    ", height=" + super.getHeight() +
                    ", wingspan=" + super.getWingspan() +
                    '}';
    }
}
