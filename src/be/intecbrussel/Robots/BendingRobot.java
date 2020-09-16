package be.intecbrussel.Robots;

public class BendingRobot extends Robot{
    private double maxBendAngle;

    public BendingRobot(String unitName, double maxBendAngle) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double angle){
        if(angle > maxBendAngle){
            System.out.println("Bending impossible! exceeding maximum angle of " + maxBendAngle + ".");
        }
        if(angle <= maxBendAngle){
            System.out.println("Bending succesful! Thanks.");
        }
    }

    @Override
    public String toString() {
        return String.format("[Bending] Name:%-10s Maximum Lift Height:%10.2f", getUnitName(), maxBendAngle);
    }
}
