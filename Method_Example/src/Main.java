public class Main {
    public static void main(String[] args) {

    // value for circle
    double radius = 5;

    //value for rectangle
    double length = 6;
    double width = 5;

    // Calculate area
    calculate_area(radius);
    calculate_area(length, width);

    }


    public static void calculate_area(double r) {
        double area = 3.14 * r * r;
        System.out.println(area);
    }


    public static void calculate_area(double l, double w) {
        double area = l * w;
        System.out.println(area);
    }


}
