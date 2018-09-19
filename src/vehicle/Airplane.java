package vehicle;

public class Airplane extends Vehicle {
    private final String type = "AIRPLANE"; //Een final string voor TYPE, dit kan niet aangepast worden (runtime).
    private String name;                    //Instantie variabele
    private boolean inAir;                  //Instantie variabele

    /**
     * Constructor die een parameter van de super/parent (Vehicle) MOET hebben.
     * Omdat een Airplane Vehicle extend, moet hij ook voldoen aan de vehicle zijn verwachtingen.
     * int mileage is de parameter die van de super/parent komt.
     *
     * @param mileage
     * @param name
     */
    public Airplane(int mileage, String name) {
        super(mileage);     //Deze methode zorgt ervoor dat bij het aanmaken van een Truck ook de mileage (verplicht van de parent) gezet wordt.
        this.name = name;
    }

    /**
     * Getter for Type
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Getter for name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Fly methode zonder verplichte parameters. Als deze methode aangeroepen wordt de fly methode die een integer verwacht aangeroepen.
     * Het doorvallen van methoden"
     */
    public void fly() {
        fly(1);
    }

    /**
     * Een methode dat er voor zorgt dat de airplane kan vliegen.
     *
     * @param miles
     */
    public void fly(int miles) {
        System.out.println("Flying (" + miles + " mile(s))");
        super.setMileage(miles);    //Naast de drive() methode zorgt fly er ook voor dat de mileage omhoog gaat. Deze gegevens moeten ook opgeslagen worden. middels "Super" wordt de setMileage methode van de parent (Vehicle) aangeroepen.
        setInAir(true);             //Een boolean wordt naar true gezet.
    }

    /**
     * Method for checking if the airplane is in the air/flying
     *
     * @return true/false
     */
    public boolean isInAir() {
        return inAir;
    }

    /**
     * Method for setting the inAir boolean.
     *
     * @param inAir
     */
    public void setInAir(boolean inAir) {
        this.inAir = inAir;
    }

    /**
     * Methode voor het landen.
     */
    public void land() {
        if (inAir) {   //Check of de inAir boolean op true staat.
            System.out.println("Plane " + getName() + " has landed!");
            setInAir(false);
        } else {
            System.out.println("The plane is already on the ground!");
        }
    }
}
