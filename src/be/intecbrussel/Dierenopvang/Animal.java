package be.intecbrussel.Dierenopvang;


import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Treatable, Vaccineatable{
    public Map<Disease, Boolean> getIsVaccinated(){
        Map<Disease, Boolean> isVaccinated = new HashMap<>();
            isVaccinated.replaceAll((d, v) -> false);

        return isVaccinated;
    }

    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;


    public Animal(){}

    public Animal(boolean isClean, int age, String name, int animalNumber) {
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
