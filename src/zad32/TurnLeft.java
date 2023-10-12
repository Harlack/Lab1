package zad32;

public class TurnLeft implements FlightOperations{
    private double angle;
    private double direction = 4.4;

    public void setAngle() {
        this.angle = angle;
    }
    @Override
    public double getDirection() {
        return direction;
    }
    public void setDirection() {
        this.direction = direction;
    }
}
