package hw16_1_garden;

/**
 * JavaAdvanced 05.07.2020
 */
public class DBPlants {
    private static Plant[] plants = {
            new Tree("Apple tree", 150),
            new Bush("Jasmin", 40),
            new Flower("Lilly", 0)};



    public static Plant[] getPlants() {
        return plants;
    }
}
