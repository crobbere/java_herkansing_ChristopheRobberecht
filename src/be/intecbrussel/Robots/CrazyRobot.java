package be.intecbrussel.Robots;


import java.util.Random;

public class CrazyRobot extends Robot{
    public CrazyRobot() {
    }

    public CrazyRobot(String unitName) {
        super(unitName);
    }

    @Override
    public void boot(){
       StringBuilder newName = new StringBuilder();
       newName.append(getUnitName());
       newName.reverse();
        System.out.println("Booting robot " + newName +" up... ");
    }

    @Override
    public String toString() {
        return "[CrazyRobot] Name: " + getUnitName() +  super.toString();
    }
}
