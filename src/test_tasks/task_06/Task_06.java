package test_tasks.task_06;

import java.util.ArrayList;
import java.util.List;

public class Task_06 {

    public static void main(String[] args) {
        List<Thing> things = new ArrayList<>();
        things.add(new Thing("Laptop", 2, 40000));
        things.add(new Thing("Binoculars", 2, 5000));
        things.add(new Thing("Book", 1, 1500));
        things.add(new Thing("Map", 1, 500));
        things.add(new Thing("First-aid kid", 4, 1500));

        Backpack backpack = new Backpack(9);
        backpack.makeAllSets(things);
        System.out.println(things);
        System.out.println();
        System.out.println(backpack.getBestThings());
    }

}
