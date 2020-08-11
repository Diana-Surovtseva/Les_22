public class Main {
    public static void main(String[] args) {
        Car kia = new Car("Kia", "black", 2015, 1500);
        Car kia2 = new Car("Kia", "black", 2015, 1500);
        System.out.println(kia.equals(kia2));
    }
}
