package task12;

import java.util.ArrayList;

public class ListtoArray {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<String>();

        List.add("Roja");
        List.add("pooja");
        List.add("naresh");
        List.add("priya");
        Object[] L = List.toArray();
        for (Object i : List.toArray()) {
            System.err.print(i + " ");
        }

    }
}
