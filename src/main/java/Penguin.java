public class Penguin implements Domesticatable, Tradable {
    private int penguin_price;

    public Penguin(){
        this.penguin_price = 0;
    }

    @Override
    public String sound() {
        return "Peep";
    }

    @Override
    public int getPrice() { return 10; }

    @Override
    public String toString(){
        String price = super.toString();
        return price + "(The price: " + this.penguin_price + ")";
    }
}
