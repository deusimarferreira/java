import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Feature {
    
    public static void main(String[] args) {
        System.out.println("-> forEach iterate through list exemple");
        List<String> cites = Arrays.asList("Brásilia", "São Paulo", "São Felix do Corbe");
        Feature.iterateThroughList(cites);

        System.out.println("\n -> forEach iterate through map exemple");
        Map<String, String> citesMap = new HashMap<>();
        citesMap.put("DF", "Brasília");
        citesMap.put("SP", "São Paulo");
        citesMap.put("BA", "São Felix do Coribe");
        Feature.iterateThroughMap(citesMap);

        System.out.println("\n -> forEach iterate through list with stream/parallel strem");
        List<String> country = Arrays.asList("Canadá", "Brasil", "United States");
        System.out.println("\n  : stream exemple");
        Feature.iterateThroughListSteam(country);

        System.out.println("\n  : parallel stream exemple");
        Feature.iterateThroughListParallelSteam(country);

    }

    static void iterateThroughList(List<String> cites) {
        cites.forEach(System.out::println);
    }

    static void iterateThroughMap(Map<?, ?> citesMap) {
        citesMap.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));
    }

    static void iterateThroughListSteam(List<String> list) {
        list.stream().forEach(System.out::println);
    }

    static void iterateThroughListParallelSteam(List<String> list) {
        list.parallelStream().forEach(System.out::println);
    }
}