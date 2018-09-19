/**
 * Dit is de parent/super class van Truck en Airplane. In deze class wordt de mileage bijgehouden en is een drive method gemaakt.
 * De drive method maakt het mogelijk voor de Truck en Airplane om te rijden/taxieen.
 */

package vehicle;    //Package declaratie.

public class Vehicle {
    private int mileage = 0;    //Instantie variabele

    public Vehicle(int mileage) {   //Constructor - De constructor verwacht een int mileage bij het aanmaken van een nieuwe vehicle.
        this.mileage = mileage;     //Met this.meleage wordt er verwezen naar de instantie variabele die de instantie van de class hoort.
    }


    /**
     * Getter voor mileage
     *
     * @return mileage
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * Setter voor mileage
     *
     * @param mileage
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * Als een Truck/Airplane/Vehicle drive aan roept wordt middels deze methode het aantal gereden KM aangepast.
     *
     * @param mileage
     */
    public void addMileage(int mileage) {
        this.mileage += mileage;
    }

    /**
     * Drive methode zonder verplichte parameters. Als deze methode aangeroepen wordt de drive methode die een integer verwacht aangeroepen.
     * "Het doorvallen van methoden"
     */
    public void drive() {
        drive(1);  //Dit roept
    }              //
                    //
                    //deze methode aan
    public void drive(int miles) {
        System.out.println("Driving (" + miles + " mile(s))");
        addMileage(miles);  //Het aantal gereden KM/mile wordt middels een andere methode (addMileage) verhoogd en opgeslagen in de instantie variabele.
    }

    /**
     * Een toString methode
     *
     * @return alle instantie variabelen die in DEZE (Vehicle) class zijn opgeslagen.
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "mileage=" + mileage +
                '}';
    }
}
