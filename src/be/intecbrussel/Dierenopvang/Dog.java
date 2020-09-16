package be.intecbrussel.Dierenopvang;

public class Dog extends Animal{
    private boolean hasFoulBreath;

    public Dog(){}

    public Dog(boolean isClean, int age, String name, int animalNumber) {
        super(isClean, age, name, animalNumber);
    }

    public void setHasFoulBreath(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public void treatAnimal() {
        if(hasFoulBreath){
            hasFoulBreath = false;
        }

    }

    @Override
    public void vaccinateAnimal(Disease disease) {
        if(disease != null && getIsVaccinated().containsKey(disease)){
            getIsVaccinated().replace(disease, true);
        }
    }

    @Override
    public String toString() {
        return String.format("[Dog]     Name: %-10s Age: %-10d Number: %-10d Must be treated: %-10b", getName(), getAge()
                ,getAnimalNumber(), hasFoulBreath);
    }
}
