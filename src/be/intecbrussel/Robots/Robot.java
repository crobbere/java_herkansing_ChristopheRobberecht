package be.intecbrussel.Robots;

public abstract class Robot {
    private String unitName;

    public Robot(){
        unitName = "Nameless Robot";
    }

    public Robot(String unitName) {
        this.unitName = unitName;
    }

    public void boot(){
        System.out.println("Booting robot " + getUnitName() + " up.");
    }

    public String getUnitName() {
        return unitName;
    }
}
