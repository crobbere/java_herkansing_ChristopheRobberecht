package be.intecbrussel.Dierenopvang;

public class Monkey extends Animal{
    private boolean isHyperactive;

    public Monkey(){}

    public Monkey(boolean isClean, int age, String name, int animalNumber) {
        super(isClean, age, name, animalNumber);
    }

    public void setHyperactive(boolean hyperactive) {
        isHyperactive = hyperactive;
    }

    @Override
    public void treatAnimal() {
        if(isHyperactive){
            isHyperactive = false;
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
        return String.format("[Monkey]  Name: %-10s Age: %-10d Number: %-10d Must be treated: %-10b", getName(), getAge()
        ,getAnimalNumber(), isHyperactive);
    }
}
