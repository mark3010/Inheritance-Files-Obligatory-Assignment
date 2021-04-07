package Cars;

public class Racer2 extends Car{
    private String color = "Red";
    public Racer2 (double currentSpeed, double acceleration,double deceleration) {
        super(currentSpeed,acceleration,deceleration);
        this.currentSpeed = currentSpeed;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
    }

}
