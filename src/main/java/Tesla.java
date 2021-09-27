public class Tesla implements Drivable, Tradable {
    public String model;
    public int maxSpeed;
    public int speed;
    public int price;

    public Tesla(String model_name, int price, int speed) {
        this.model = model_name;
        this.maxSpeed = 200;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public void upgradeSpeed() {
        this.speed += +10;
    }

    @Override
    public void downgradeSpeed() {
        this.speed += -10;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Model: " + this.model +")" + " (Price: " + this.price +")" + " (Speed: " + this.speed +")";
    }
}
