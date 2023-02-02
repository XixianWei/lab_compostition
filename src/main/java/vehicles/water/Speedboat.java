package vehicles.water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Speedboat extends Vehicle implements IMotorised,IWaterVehicle {

    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised motor) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motor = motor;
    }

    private String hullType;
    private IMotorised motor;
    private IMotorised engine;
    private Motor hp;


    @Override
    public void startEngine() {
        this.engine.startEngine();

    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();

    }

    @Override
    public int getHp() {
        return this.hp.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.hp.setHp(hp);

    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
         this.engine.setFuel(fuel);

    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String type) {
       this.hullType = hullType;

    }
}
