import java.util.*;

public class Parser {
    public static void main(String[] args) {
        Scanner s = new Scanner(
                "dog         labrador\n" +
                        "dog         spaniel\n" +
                        "dog         corgi\n" +
                        "fruit       orange\n" +
                        "fruit       banana\n" +
                        "computer    acer\n" +
                        "computer    asus\n" +
                        "computer    ibm");

        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();

        while (s.hasNext()) {

            String key = s.next();
            if (!map.containsKey(key))
                map.put(key, new LinkedList<String>());

            map.get(key).add(s.next());
        }

        System.out.println(map);
    }
}