package domain;

import java.util.Date;

// T.T ieri ha perso

/**
 * Classe che definisce l'animale "aquila".
 * Estende WingedAnimal
 */
public class Eagle extends WingedAnimal {
    public Eagle() {
    }
    public Eagle(String name, String favFood, int age, Date joinedIn, double weight, int height, float wingspan){
        super(name, favFood, age, joinedIn, weight, height, wingspan);
    }

    @Override
    public String toString() {
        return "Eagle{} " + super.toString();
    }
}
