import java.util.ArrayList;

public class DataSet {
    private ArrayList<Double> values = new ArrayList<>();

    public void add(double value) {
        values.add(value);
    }

    public double getAverage() {
        return values.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public double getSmallest() {
        return values.stream().min(Double::compare).orElse(0.0);
    }

    public double getLargest() {
        return values.stream().max(Double::compare).orElse(0.0);
    }

    public double getRange() {
        return getLargest() - getSmallest();
    }
}


