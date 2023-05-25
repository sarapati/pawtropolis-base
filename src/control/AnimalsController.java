package control;

import domain.Animal;
import domain.TailedAnimal;
import domain.WingedAnimal;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Classe che implementa le operazioni di ricerca su tutti gli animali.
 */
public class AnimalsController {

    private Map<Class<? extends Animal>, List<Animal>> map;

    public AnimalsController(){
        map = new HashMap<>();
    }

    /*
    Aggiunge un esemplare di animale alla mappa
     */
    public void addAnimal(Animal animal) {
        if(!map.containsKey(animal.getClass())) {
            List<Animal> list = new ArrayList<>();
            map.put(animal.getClass(),list);
        }
        map.get(animal.getClass()).add(animal);
    }

    /*
    Ricerca e restituisce esemplare di animale più alto
     */
    public <T extends Animal> T getTallestAnimalBySpecies(Class<T> clazz){
        return map.getOrDefault(clazz, null)
                .stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .max(Comparator.comparing(T::getHeight)).orElse(null);
    }

    /*
    Ricerca e restituisce esemplare di animale più basso
     */
    public <T extends Animal> T getShortestAnimalBySpecies(Class<T> clazz) {
        return map.getOrDefault(clazz, null)
                .stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .min(Comparator.comparing(T::getHeight)).orElse(null);
    }

    /*
    Ricerca e restituisce esemplare di animale più pesante
     */
    public <T extends Animal> T getHeaviestAnimalBySpecies(Class<T> clazz) {
        return map.getOrDefault(clazz, null)
                .stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .max(Comparator.comparing(T::getWeight)).orElse(null);
    }

    /*
    Ricerca e restituisce esemplare di animale più leggero
     */
    public <T extends Animal> T getLightestAnimalBySpecies(Class<T> clazz){
       return  map.getOrDefault(clazz, null)
                .stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .min(Comparator.comparing(T::getWeight)).orElse(null);
    }

    /*
    Ricerca e restituisce esemplare di animale dotato di coda
    con coda più lunga
     */
    public TailedAnimal getAnimalWithLongestTail(){
        return getAnimalsBySpecificClass(TailedAnimal.class).stream()
                .max(Comparator.comparing(TailedAnimal::getTailLength)).orElse(null);
    }

    /*
    Ricerca e restituisce esemplare di animale dotato di ali
    con maggior apertura alare
   */
    public WingedAnimal getAnimalWithWidestWingspan(){
        return getAnimalsBySpecificClass(WingedAnimal.class).stream()
                .max(Comparator.comparing(WingedAnimal::getWingspan)).orElse(null);

    }

    private <T extends Animal> List<T> getAnimalsBySpecificClass(Class<T> clazz){
        return map.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .collect(Collectors.toList());
    }
}
