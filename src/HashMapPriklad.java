import java.util.HashMap;

public class HashMapPriklad {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("USA", "New York");
        System.out.println(capitalCities);

        System.out.println("Hlavné mesto Veľkej Británie je: " + capitalCities.get("England"));
        System.out.println("Hlavné mesto USA je: " + capitalCities.get("USA"));


        System.out.println("\nŠtáty a ich hlavné mestá sú:");
        System.out.println("-----------------------------");
        // Print keys and values
        for (String country : capitalCities.keySet()) {
            System.out.println("key: " + country + " value: " + capitalCities.get(country));
        }
    }
}
