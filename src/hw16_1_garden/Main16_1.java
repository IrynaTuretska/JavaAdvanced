package hw16_1_garden;

/**
 * JavaAdvanced 05.07.2020
 */
public class Main16_1 {
    public static void main(String[] args) {

        Plant[] plants = DBPlants.getPlants();

        for (Plant element : plants) {
            element.year();
            element.year(); //second year!
        }
        System.out.println("- - - - - -");


    }
}

