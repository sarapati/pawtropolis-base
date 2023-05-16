package domain;


import java.time.LocalDate;

/**
 * Classe generica per descrivere tutti gli animali.
 */
public class Animal {
    private String name;
    private String favFood;
    private int age;
    private LocalDate joinedIn;
    private double weight;
    private double height;

    public Animal() {}
    public Animal(String name, String favFood, int age, LocalDate joinedIn, double weight, double height) {
        this.name = name;
        this.favFood = favFood;
        this.age = age;
        this.joinedIn = joinedIn;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getJoinedIn() {
        return joinedIn;
    }

    public void setJoinedIn(LocalDate joinedIn) {
        this.joinedIn = joinedIn;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", favFood='" + favFood + '\'' +
                ", age=" + age +
                ", joinedIn=" + joinedIn +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

}
