import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Лист
        List<String> names = new ArrayList<>();
        names.add("Саня");
        names.add("Саша");
        names.add("Санёк");
        names.add("Саня");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.getFirst());
        System.out.println(names.contains("Саша"));
        names.remove("Саня");
        System.out.println(names);

        //Сет
        Set<String> set = new HashSet<>();
        set.add("Саня");
        set.add("Саша");
        set.add("Санёк");
        set.add("Саня");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains("Санёк"));

        //Словарь
        Map<String, Integer> map = new HashMap<>();
        map.put("Саня", 20);
        map.put("Саша", 22);
        map.put("Санёк", 25);
        System.out.println(map.get("Саша"));
        map.put("Саня", 21);

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        for (Integer value : map.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}