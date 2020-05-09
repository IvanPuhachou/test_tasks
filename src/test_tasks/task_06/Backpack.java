package test_tasks.task_06;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private List<Thing> bestThings = null;
    private double maxW;
    private double bestPrice;


    private double calcWeight(List<Thing> things) {
        double result = 0;
        for (Thing thing : things) {
            result += thing.getWeight();
        }
        return result;
    }

    private double calcPrice(List<Thing> things) {
        double result = 0;
        for (Thing thing : things) {
            result += thing.getPrice();
        }
        return result;
    }

    private void checkSet(List<Thing> things) {
        if (this.bestThings == null) {
            if (this.calcWeight(things) <= this.maxW) {
                this.bestThings = things;
                this.bestPrice = this.calcPrice(things);
            }
        } else {
            if (this.calcWeight(things) <= this.maxW && this.calcPrice(things) > this.bestPrice) {
                this.bestThings = things;
                this.bestPrice = this.calcPrice(things);
            }
        }
    }

    public void makeAllSets(List<Thing> things) {
        if (things.size() > 0) {
            this.checkSet(things);
        }
        for (int i = 0; i < things.size(); i++) {
            List<Thing> newSet = new ArrayList<>(things);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public Backpack(double maxW) {
        this.maxW = maxW;
    }

    public List<Thing> getBestThings() {
        return this.bestThings;
    }

}