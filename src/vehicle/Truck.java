package vehicle;

public class Truck extends Vehicle {
    private final String type = "TRUCK";    //Een final string voor TYPE, dit kan niet aangepast worden (runtime).
    private int maxCapacity;                //Instantie variabele
    private int capacity;                   //Instantie variabele

    /**
     * Constructor die een parameter van de super/parent (Vehicle) MOET hebben.
     * Omdat een Truck Vehicle extend, moet hij ook voldoen aan de vehicle zijn verwachtingen.
     * int mileage is de parameter die van de super/parent komt.
     *
     * @param mileage
     * @param maxCapacity
     */
    public Truck(int mileage, int maxCapacity) {
        super(mileage);                     //Deze methode zorgt ervoor dat bij het aanmaken van een Truck ook de mileage (verplicht van de parent) gezet wordt.
        this.maxCapacity = maxCapacity;
    }

    /**
     * Constructor ZONDER de verplichte parameter van de super/parent class (Vehicle).
     * In deze constructor wordt er middels "this" 2 parameters gezet.
     * '0' is de mileage die de superclass verwacht, maxCapacity is de parameter die doorgegeven wordt door de programmeur.
     *
     * @param maxCapacity
     */
    public Truck(int maxCapacity) {
        this(0, maxCapacity);
    }

    /**
     * Method for returning the max capacity.
     *
     * @return maxCapacity
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Method for returning the type.
     *
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Method for setting the max capacity of the truck.
     *
     * @param maxCapacity
     */
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * Method for getting the capacity/load of the truck.
     *
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Method for setting the capacity/load of the truck.
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity += capacity;
    }

    /**
     * Method for filling the truck.
     *
     * @param load
     */
    public void fillTruck(int load) {
        if ((getCapacity() + load) > maxCapacity) { //Een check die kijkt of er nog genoeg "capacity" in de truck aanwezig is.
            int temp = (getCapacity() + load) - maxCapacity;    //een LOCALE variabele om bij te houden hoeveel "load" er te veel is.
            System.out.println("The truck has reached his maximum capacity (" + temp + " too much), we can't fill it.");
        } else {
            setCapacity(load);  //"Eat your own dogfood", maak gebruik van je eigen methoden om je variabelen te zetten.
        }
    }

    /**
     * Een toString methode.
     *
     * @return alle instantie variabelen die in DEZE (Truck) class + de PARENT class (vehicle) zijn opgeslagen.
     * Deze methode maakt gebruik van een "super" call. Dit zorgt er voor dat de toString methode van vehicle eerst aangeroepen wordt en
     * vervolgens verder gaat met deze methode.
     */
    @Override
    public String toString() {
        return super.toString() + "Truck{" +
                "type='" + type + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", capacity=" + capacity +
                '}';
    }
}
