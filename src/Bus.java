public class Bus extends Vehicle {

    public Bus(){
        super();
    }

    @Override
    public void changeGear(int newGear){
        System.out.println("new gear is: " + newGear);
    }

    @Override
    public void speedUp(int increment){
        setSpeed(getSpeed() + increment);
        System.out.println("new speed is: " + getSpeed());
    }

    @Override
    public void applyBrakes(int decrement){
        setSpeed(getSpeed() - decrement);
        System.out.println("new speed is: " + getSpeed());

    }

    @Override
    public void printState(){
        System.out.println("Bus state: ….");
    }
}
