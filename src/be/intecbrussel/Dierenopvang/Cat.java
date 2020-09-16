package be.intecbrussel.Dierenopvang;

public class Cat extends Animal{
    private boolean hasLongNails;

    public Cat(){}

    public Cat(boolean isClean, int age, String name, int animalNumber) {
        super(isClean, age, name, animalNumber);
    }

    public void setHasLongNails(boolean hasLongNails) {
        this.hasLongNails = hasLongNails;
    }

    @Override
    public void treatAnimal() {
        if(hasLongNails){
            hasLongNails = false;
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
        return String.format("[Cat]     Name: %-10s Age: %-10d Number: %-10d Must be treated: %-10b", getName(), getAge()
                ,getAnimalNumber(), hasLongNails);
    }
}
