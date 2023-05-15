package domain;

import java.util.Date;

/**
 * Classe che definisce l'animale "tigre".
 * Estende TailedAnimal
 */
public class Tiger extends TailedAnimal {

    public Tiger() {
    }

    public Tiger(String name, String favFood, int age, Date joinedIn, double weight, int height, int tailLength) {
        super(name, favFood, age, joinedIn, weight, height, tailLength);
    }

    @Override
    public String toString() {
        return "Tiger{} " + super.toString();
    }
}
