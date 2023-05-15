package domain;


import java.util.Date;

/**
 * Classe che definisce l'animale "leone".
 * Estende TailedAnimal
 */
public class Lion extends TailedAnimal {

    public Lion() {}

    public Lion(String name, String favFood, int age, Date joinedIn, double weight, int height, int tailLength) {
        super(name, favFood, age, joinedIn, weight, height, tailLength);
    }

    @Override
    public String toString() {
        return "Lion{} " + super.toString();
    }
}
