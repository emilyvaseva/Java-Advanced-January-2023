package P03SetsAndMapsAdvanced;

import java.util.*;

public class P07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> citiesByContinentAndCountry = new LinkedHashMap();

        while (--n >= 0) {
            String input = scanner.nextLine();
            String continents = input.split("\\s+")[0];
            String countries = input.split("\\s+")[1];
            String cities = input.split("\\s+")[2];
            citiesByContinentAndCountry.putIfAbsent(continents, new LinkedHashMap<>());
            Map<String, List<String>> citiesByCountry = citiesByContinentAndCountry.get(continents);
            citiesByCountry.putIfAbsent(countries, new ArrayList<>());
            citiesByCountry.get(countries).add(cities);
        }


        citiesByContinentAndCountry.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ":");
                    entry.getValue().entrySet().stream()
                            .forEach(country -> {
                                String output = String.join(", ", country.getValue());
                                System.out.println(" " + country.getKey() + " -> " + output);
                            });
                });

    }
}
