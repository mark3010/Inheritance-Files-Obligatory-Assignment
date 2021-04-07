package Cars;

public abstract class Car {
    //attributes we want for all cars
    double currentSpeed = 0;
    double acceleration = 10;
    double deceleration = .5;

    //constructor
    Car (double currentSpeed, double acceleration,double deceleration) {
        this.currentSpeed = currentSpeed;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
    }

    //methods we want to use for all cars
    public void accelerate(){
        currentSpeed += acceleration;
    }

    public void decelerate(){
        currentSpeed *= deceleration;
    }
}