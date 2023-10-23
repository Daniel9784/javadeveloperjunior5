package dodatocnetemy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPriklad {
    public static void main(String[] args) {
        // Set
        Set<String> set = new HashSet<>();
        set.add("jedna");
        set.add("dva");
        set.add("jedna"); // Ignorovaný duplikát
        System.out.println("Set: " + set);

        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("jedna");
        arrayList.add("dva");
        arrayList.add("jedna"); // Duplikát
        System.out.println("ArrayList: " + arrayList);
    }
}
