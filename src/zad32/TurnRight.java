package zad32;

public class TurnRight implements FlightOperations{
    private double angle;
    private double direction = 6.3;
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
