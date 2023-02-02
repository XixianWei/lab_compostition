package vehicles.water;

import products.IProduct;
import products.Product;
import vehicles.Vehicle;

public class Kayak extends Vehicle implements IWaterVehicle{

    private String hullType;
    private Product product;
    private Vehicle vehicle;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct, String hullType) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
    }

    @Override
    public float getPrice() {
        return this.product.getPrice();
    }

    @Override
    public long getInventory() {
        return this.product.getInventory();
    }

    @Override
    public void setPrice(float price) {
        this.product.setPrice(price);

    }

    @Override
    public void setInventory(long amount) {
        this.product.setInventory(amount);

    }

    @Override
    public void setTitle(String title) {
        this.product.setTitle(title);

    }

    @Override
    public String getTitle() {
        return this.product.getTitle();
    }

    @Override
    public void addInventory(long amount) {
        this.product.addInventory(amount);

    }

    @Override
    public void removeInventory(long amount) throws Exception {
        this.product.removeInventory(amount);

    }

    @Override
    public float getWeight() {
        return this.vehicle.getWeight();
    }

    @Override
    public int getMaxSpeed() {
        return this.vehicle.getMaxSpeed();
    }

    @Override
    public void setWeight(float weight) {
        this.vehicle.setWeight(weight);

    }

    @Override
    public void setMaxSpeed(int speed) {
        this.vehicle.setMaxSpeed(speed);

    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String type)  {
        this.hullType= hullType;

    }
}
