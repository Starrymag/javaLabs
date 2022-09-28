public class main {
    public static void main (String[] args) {
        Circle c1 = new Circle();
        System.out.println("--------------------");
        System.out.println(c1);
        Circle c2 = new Circle(20.0);
        System.out.println("--------------------");
        System.out.println(c2);
        Circle c3 = new Circle(30.0, "orange", 60.9, 80.1);
        System.out.println("--------------------");
        System.out.println(c3);
    }
}
