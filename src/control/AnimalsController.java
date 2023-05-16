package control;

import domain.Animal;
import domain.TailedAnimal;
import domain.WingedAnimal;

import java.util.Comparator;
import java.util.List;

/**
 * Classe che implementa le operazioni di ricerca su tutti gli animali.
 */
public class AnimalsController {

    private List<Animal> animalList;

    public AnimalsController(List<Animal> animalList){
        this.animalList = animalList;
    }

    /*
    Ricerca e restituisce esemplare di animale più alto
     */
    public Animal findAnimalByMaxHeight(){
        return animalList.stream().max(Comparator.comparing(Animal::getHeight)).get();
    }

    /*
    Ricerca e restituisce esemplare di animale più basso
     */
    public Animal findAnimalByMinHeight() {
        return animalList.stream().min(Comparator.comparing(Animal::getHeight)).get();
    }

    /*
    Ricerca e restituisce esemplare di animale più pesante
     */
    public Animal findAnimalByMaxWeight() {
        return animalList.stream().max(Comparator.comparing(Animal::getWeight)).get();
    }

    /*
    Ricerca e restituisce esemplare di animale più leggero
     */
    public Animal findAnimalByMinWeight(){
        return animalList.stream().min(Comparator.comparing(Animal::getWeight)).get();
    }

    /*
    Ricerca e restituisce esemplare di animale dotato di coda
    con coda più lunga
     */
    public TailedAnimal findAnimalByLongestTail(){
        return animalList.stream().filter(TailedAnimal.class::isInstance).map(TailedAnimal.class::cast).max(Comparator.comparing(TailedAnimal::getTailLength)).get();
    }

    /*
    Ricerca e restituisce esemplare di animale dotato di ali
    con maggior apertura alare
   */
    public WingedAnimal findAnimalByWidestWingspan(){
        return animalList.stream().filter(WingedAnimal.class::isInstance).map(WingedAnimal.class::cast).max(Comparator.comparing(WingedAnimal::getWingspan)).get();

    }
}
