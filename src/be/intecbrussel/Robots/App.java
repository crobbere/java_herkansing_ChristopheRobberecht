package be.intecbrussel.Robots;

public class App {
    public static void main(String[] args) {
        BendingRobot bendingRobot1 = new BendingRobot("Jack", 280);
        BendingRobot bendingRobot2 = new BendingRobot("Bender", 1);

        LiftingRobot liftingRobot1 = new LiftingRobot("Francis", 100);
        LiftingRobot liftingRobot2 = new LiftingRobot("Robert", 5);

        CrazyRobot crazyRobot = new CrazyRobot("Jules");
        bendingRobot1.boot();
        bendingRobot1.bend(279);
        bendingRobot2.bend(2);

        liftingRobot1.lift(99);
        liftingRobot2.lift(6);

        crazyRobot.boot();
    }
}
