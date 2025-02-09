public class Cars {
    public static String getCarName(String name) {
        return "Car name is " + name;
    }
    public static void main(String[] args) {
        Cars benz = new Cars();
        String carNameFromMethod = benz.getCarName("benz");
        System.out.println(carNameFromMethod);
    }
}