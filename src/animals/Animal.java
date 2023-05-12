package animals;


import java.util.Date;

/**
 * Classe generica per descrivere tutti gli animali
 */
public class Animal {
    private String name;
    private String favFood;
    private int age;
    private Date joinedIn;
    private double weight;
    private int height;

    public Animal() {}
    public Animal(String name, String favFood, int age, Date joinedIn, double weight, int height) {
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

    public Date getJoinedIn() {
        return joinedIn;
    }

    public void setJoinedIn(Date joinedIn) {
        this.joinedIn = joinedIn;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
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
