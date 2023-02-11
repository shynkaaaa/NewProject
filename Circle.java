public class Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        System.out.println(c1);
        Circle c2 = new Circle();
        System.out.println(c2);

        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());

        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
    private double radius = 1.0;
    Circle() {
    }
    Circle(double radius) {
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return 3.14 * radius * radius;
    }
    double getCircumference() {
        return 2 * 3.14 * radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}