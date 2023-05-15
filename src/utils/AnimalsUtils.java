package utils;

import domain.Animal;
import domain.TailedAnimal;
import domain.WingedAnimal;

import java.util.List;

/**
 * Classe che implementa le operazioni di ricerca su tutti gli animali.
 */
public class AnimalsUtils {

    private List<Animal> animalList;

    public AnimalsUtils(List<Animal> animalList){
        this.animalList = animalList;
    }

    /*
    Ricerca e restituisce esemplare di animale più alto
     */
    public Animal findAnimalByMaxHeight(){
        Animal maxAnimal = animalList.get(0);
        for(Animal a : animalList){
            if(a.getHeight() > maxAnimal.getHeight())
                maxAnimal = a;
        }
        return maxAnimal;
    }

    /*
    Ricerca e restituisce esemplare di animale più basso
     */
    public Animal findAnimalByMinHeight() {
        Animal minAnimal = animalList.get(0);
        for(Animal a : animalList){
            if(a.getHeight() < minAnimal.getHeight())
                minAnimal = a;
        }
        return minAnimal;
    }


    /*
    Ricerca e restituisce esemplare di animale più pesante
     */
    public Animal findAnimalByMaxWeight() {
        Animal maxAnimal = animalList.get(0);
        for(Animal a : animalList){
            if(a.getWeight() > maxAnimal.getWeight())
                maxAnimal = a;
        }
        return maxAnimal;
    }

    /*
    Ricerca e restituisce esemplare di animale più leggero
     */
    public Animal findAnimalByMinWeight(){
        Animal minAnimal = animalList.get(0);
        for(Animal a : animalList){
            if(a.getWeight() < minAnimal.getWeight())
                minAnimal = a;
        }
        return minAnimal;
    }

    /*
    Ricerca e restituisce esemplare di animale dotato di coda
    con coda più lunga
     */
    public TailedAnimal findAnimalByLongestTail(){
        TailedAnimal maxAnimal = new TailedAnimal();
        for(Animal a : animalList){
            if(a instanceof TailedAnimal) {
                if (((TailedAnimal) a).getTailLength() > maxAnimal.getTailLength())
                    maxAnimal = (TailedAnimal) a;
            }
        }
        return maxAnimal;
    }

    /*
    Ricerca e restituisce esemplare di animale dotato di ali
    con maggior apertura alare
   */
    public WingedAnimal findAnimalByWidestWingspan(){
        WingedAnimal maxAnimal = new WingedAnimal();
        for(Animal a : animalList){
            if(a instanceof WingedAnimal) {
                if (((WingedAnimal) a).getWingspan() > maxAnimal.getWingspan())
                    maxAnimal = (WingedAnimal) a;
            }
        }
        return maxAnimal;
    }
}
