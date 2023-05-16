package domain;


import java.time.LocalDate;
import java.util.Date;

/**
 * Classe che definisce l'animale "leone".
 * Estende TailedAnimal
 */
public class Lion extends TailedAnimal {

    public Lion() {}

    public Lion(String name, String favFood, int age, LocalDate joinedIn, double weight, double height, int tailLength) {
        super(name, favFood, age, joinedIn, weight, height, tailLength);
    }

    @Override
    public String toString() {
        return "Lion{" +
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
