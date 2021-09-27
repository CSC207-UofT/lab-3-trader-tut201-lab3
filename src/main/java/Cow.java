/*
A class for the type of creature Cow.
 */
public class Cow implements Tradable, Domesticatable{
    private String breed;
    public Cow(String breed){
        this.breed = breed;
    }
    public Cow(){
        this.breed = "Angus";
    }



                /**
                 * Return the sound made by this creature.
                 *
                 * @return    The sound made by this creature.
                 */
                @Override
                public String sound() {
                    return "Moo";
                }



                /**
                 * Return the price of this creature
                 *
                 * @return      The price of this creature.
                 */
                @Override
                public int getPrice() {
                return 600;
                }

    /**
     * Returns the breed of the cow.
     *
     * @return      The breed of the cow.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets the breed of the cow.
     *
     * @param breed     The breed of the cow to set.
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
