package be.intecbrussel.Dierenopvang.app;



import be.intecbrussel.Dierenopvang.*;
import be.intecbrussel.Dierenopvang.services.AnimalShelter;

public class App {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();
        // instance animals.
        Cat cat1 = new Cat(true, 4, "Flip", 1);
        Cat cat2 = new Cat(false, 8, "Ket", 3);
        Cat cat3 = new Cat(true, 16, "Sphinx", 9);
        Dog dog1 = new Dog(true, 7, "Spok", 69);
        Dog dog2 = new Dog(false, 9, "Pwet", 29);
        Dog dog3 = new Dog();
        Dog dog4 = new Dog(true, 5, "Buck", 2);
        Monkey monk1 = new Monkey();
        Monkey monk2 = new Monkey(true, 26, "Chris", 12);
        Monkey monk3 = new Monkey(true, 2, "Flinkerflop", 4);

        //treatable
        cat3.setHasLongNails(true);
        dog3.setHasFoulBreath(true);
        monk3.setHyperactive(true);
        cat2.setHasLongNails(true);
        //adding animals to the shelter
        animalShelter.addAnimal(cat1);
        animalShelter.addAnimal(cat2);
        animalShelter.addAnimal(cat3);
        animalShelter.addAnimal(monk1);
        animalShelter.addAnimal(monk2);
        animalShelter.addAnimal(monk3);
        animalShelter.addAnimal(dog4);
        animalShelter.addAnimal(dog3);
        animalShelter.addAnimal(dog2);
        animalShelter.addAnimal(dog1);

        //testing methods - works
        System.out.println("Number of Animals: ");
        System.out.println(animalShelter.countAnimals());
        System.out.println("Oldest animal: " + animalShelter.findOldestAnimal());
        System.out.println("Animal FOUND: " + animalShelter.findAnimal("Chris"));
        System.out.println("Animal FOUND: " + animalShelter.findAnimal(9));
        System.out.println("Treating process: ");
        animalShelter.treatAnimal(9);
        System.out.println("Animal FOUND: " + animalShelter.findAnimal(9));

        animalShelter.sortAnimalsByAge();
        animalShelter.printAnimals();
        //after super treat - works
        System.out.println("\nAfter treating");
        animalShelter.treatAllAnimals();
        animalShelter.printAnimals();

        // sorting animals - works

        animalShelter.sortAnimalsByAge();
        animalShelter.printAnimals();


    }
}
