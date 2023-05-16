package domain;


import java.time.LocalDate;
import java.util.Date;

/**
 * Classe rappresentante animali dotati di ali.
 * Estende Animale
 */
public class WingedAnimal extends Animal {
    private float wingspan;

    public WingedAnimal() {}

    public WingedAnimal(String name, String favFood, int age, LocalDate joinedIn, double weight, double height, float wingspan){
        super(name, favFood, age, joinedIn, weight, height);
        this.wingspan = wingspan;
    }

    public float getWingspan() {
        return wingspan;
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return  "WingedAnimal{"+
                "name='" + super.getName() + '\'' +
                ", favFood='" + super.getFavFood() + '\'' +
                ", age=" + super.getAge() +
                ", joinedIn=" + super.getJoinedIn() +
                ", weight=" + super.getWeight() +
                ", height=" + super.getHeight() +
                ", wingspan=" + wingspan +
                '}';
    }
}
