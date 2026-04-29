import java.util.*;
import java.util.stream.Collectors;

class Bogie {
String name;
int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class uc9 {
public static void main(String[] args) {
List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 60));
        bogies.add(new Bogie("AC Chair", 48));

        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println(b.name + " : " + b.capacity);
            }
        }
    }
}