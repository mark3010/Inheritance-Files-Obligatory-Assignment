package Cars;

public abstract class Car {
    double currentSpeed = 0;
    double acceleration = 10;
    double deceleration = .5;
    //int stockA = 10, stockB = 10, stockC =10, stockD = 10;

    //constructor
    Car (double currentSpeed, double acceleration,double deceleration) {
        this.currentSpeed = currentSpeed;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
    }

    public void accelerate(){
        currentSpeed += acceleration;
    }

    public void decelerate(){
        currentSpeed *= deceleration;
    }
}