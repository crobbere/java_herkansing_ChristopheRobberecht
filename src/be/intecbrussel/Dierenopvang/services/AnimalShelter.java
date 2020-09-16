package be.intecbrussel.Dierenopvang.services;

import be.intecbrussel.Dierenopvang.Animal;
import be.intecbrussel.Dierenopvang.Disease;
import be.intecbrussel.Dierenopvang.Treatable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnimalShelter {
    private List<Animal> animals = new ArrayList<>();
    private int animalId = 0;

    public void printAnimals(){
        System.out.println("\nALL Animals:");
        animals.forEach(System.out::println);
    }
    public void sortAnimals(){
        Comparator<Animal> compareByNumber = Comparator.comparing(Animal::getAnimalNumber);
        animals.sort(compareByNumber);
    }
    public void sortAnimalsByName(){
        Comparator<Animal> compareByName = Comparator.comparing(Animal::getName);
        animals.sort(compareByName);
    }
    public void sortAnimalsByAge(){
        Comparator<Animal> comparebyAge = Comparator.comparing(Animal::getAge);
        animals.sort(comparebyAge);
    }
    public void printAllAnimalsNotVaccinated(Disease disease){

    }
    public Animal findAnimal(int number){
        for(Animal animal : animals){
            if(animal.getAnimalNumber() == number){
                return animal;
            }
        }
        return null;
    }
    public Animal findAnimal(String name){
        for(Animal animal : animals){
            if(animal.getName().equals(name)){
                return animal;
            }
        }
        return null;
    }
    public void treatAnimal(int number){
       findAnimal(number).treatAnimal();
    }
    public void treatAnimal(String name){
        findAnimal(name).treatAnimal();
    }
    public void treatAllAnimals(){
        animals.forEach(Treatable::treatAnimal);
    }
    public Animal findOldestAnimal(){
        Comparator <Animal> compareByAge = Comparator.comparing(Animal::getAge);
        animals.sort(Collections.reverseOrder(compareByAge));
        return animals.get(0);
    }
    public int countAnimals(){
        return animals.size();
    }

    public void addAnimal(Animal animal){
        if(animal != null){
            animals.add(animal);
            animalId++;
        }
    }

}
