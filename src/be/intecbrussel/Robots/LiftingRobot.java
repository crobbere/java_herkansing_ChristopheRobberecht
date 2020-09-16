package be.intecbrussel.Robots;

public class LiftingRobot extends Robot{
    private double maxLiftHeight;

    public LiftingRobot(String unitName, double maxLiftHeight) {
        super(unitName);
        this.maxLiftHeight = maxLiftHeight;
    }

    public void lift(double height){
        if(height > maxLiftHeight){
            System.out.println("Lifting impossible! Exceeding maximum lift height of: " + maxLiftHeight + ".");
        }
        if(height <= maxLiftHeight){
            System.out.println("Lifting succeeded! Thanks.");
        }
    }

    @Override
    public String toString() {
        return String.format("[Lifting Robot] Name:%-10s Maximum Lift Height:%10.2f", getUnitName(), maxLiftHeight);
    }
}
