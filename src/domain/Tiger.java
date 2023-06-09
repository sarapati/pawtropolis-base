package domain;

import java.time.LocalDate;

/**
 * Classe che definisce l'animale "tigre".
 * Estende TailedAnimal
 */
public class Tiger extends TailedAnimal {

    public Tiger() {
    }

    public Tiger(String name, String favFood, int age, LocalDate joinedIn, double weight, double height, int tailLength) {
        super(name, favFood, age, joinedIn, weight, height, tailLength);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + super.getName() + '\'' +
                ", favFood='" + super.getFavFood() + '\'' +
                ", age=" + super.getAge() +
                ", joinedIn=" + super.getJoinedIn() +
                ", weight=" + super.getWeight() +
                ", height=" + super.getHeight() +
                ", tailLength=" + super.getTailLength() +
                "} ";
    }
}
