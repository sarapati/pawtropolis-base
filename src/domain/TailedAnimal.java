package domain;

import java.time.LocalDate;

/**
 * Classe rappresentante animali dotati di coda.
 * Estende Animale
 */
public class TailedAnimal extends Animal {
    private int tailLength;

    public TailedAnimal() {
    }

    public TailedAnimal(String name, String favFood, int age, LocalDate joinedIn, double weight, double height, int tailLength){
        super(name, favFood, age, joinedIn, weight, height);
        this.tailLength = tailLength;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "TailedAnimal{" +
                "name='" + super.getName() + '\'' +
                ", favFood='" + super.getFavFood() + '\'' +
                ", age=" + super.getAge() +
                ", joinedIn=" + super.getJoinedIn() +
                ", weight=" + super.getWeight() +
                ", height=" + super.getHeight() +
                ", tailLength=" + tailLength +
                "} ";
    }
}
