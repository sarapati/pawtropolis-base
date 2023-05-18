package control;

import domain.Animal;
import domain.TailedAnimal;
import domain.WingedAnimal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Classe che implementa le operazioni di ricerca su tutti gli animali.
 */
public class AnimalsController {

    private List<Animal> animalList;

    public AnimalsController(){
        animalList = new ArrayList<>();
    }

    /*
    Restituisce la lista di tutti gli animali
     */
    public List<Animal> getAnimalList() {
        return animalList;
    }

    /*
    Aggiunge un esemplare di animale alla lista
     */
    public void addAnimalToList(Animal animal) {
        animalList.add(animal);
    }

    /*
    Ricerca e restituisce esemplare di animale più alto
     */
    public Animal getTallestAnimal(){
        return animalList.stream().max(Comparator.comparing(Animal::getHeight)).get();
    }

    /*
    Ricerca e restituisce esemplare di animale più basso
     */
    public Animal getShortestAnimal() {
        return animalList.stream().min(Comparator.comparing(Animal::getHeight)).get();
    }

    /*
    Ricerca e restituisce esemplare di animale più pesante
     */
    public Animal getHeaviestAnimal() {
        return animalList.stream().max(Comparator.comparing(Animal::getWeight)).get();
    }

    /*
    Ricerca e restituisce esemplare di animale più leggero
     */
    public Animal getLightestAnimal(){
        return animalList.stream().min(Comparator.comparing(Animal::getWeight)).get();
    }

    /*
    Ricerca e restituisce esemplare di animale dotato di coda
    con coda più lunga
     */
    public TailedAnimal getAnimalWithLongestTail(){
        return animalList.stream().filter(TailedAnimal.class::isInstance).map(TailedAnimal.class::cast).max(Comparator.comparing(TailedAnimal::getTailLength)).get();
    }

    /*
    Ricerca e restituisce esemplare di animale dotato di ali
    con maggior apertura alare
   */
    public WingedAnimal getAnimalWithWidestWingspan(){
        return animalList.stream().filter(WingedAnimal.class::isInstance).map(WingedAnimal.class::cast).max(Comparator.comparing(WingedAnimal::getWingspan)).get();

    }
}
