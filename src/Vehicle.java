public abstract class Vehicle {
    private int speed;
    private int gear;

    public Vehicle(){
        this.speed = 0;
        this.gear = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public abstract void printState();

    public void changeGear(int newGear){
        this.gear = newGear;
    }

    public void speedUp(int increment){
        this.speed = getSpeed() + increment;
    }

    public void applyBrakes(int decrement){
        this.speed = getSpeed() - decrement;
    }

}
