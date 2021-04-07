package Cars;

public class Racer1 extends Car {
    private String color = "Yellow";
    public Racer1 (double currentSpeed, double acceleration,double deceleration) {
        super(currentSpeed,acceleration,deceleration);
        this.currentSpeed = currentSpeed;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
    }
}
