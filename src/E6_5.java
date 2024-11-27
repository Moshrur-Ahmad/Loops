public class E6_5 {
    public static void main(String[] args) {
        DataSet data = new DataSet();
        data.add(10.5);
        data.add(20.0);
        data.add(15.2);

        System.out.println("Average: " + data.getAverage());
        System.out.println("Smallest: " + data.getSmallest());
        System.out.println("Largest: " + data.getLargest());
        System.out.println("Range: " + data.getRange());
    }
}