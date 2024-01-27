package Scanner;

import java.util.Scanner;

abstract class RoundShape {

    double radius;
    final double pi = 3.14;

    abstract void findArea();

    abstract void findVolume();

    abstract void disp();
}

class Sphere extends RoundShape {

    Double area;
    Scanner sc = new Scanner(System.in);

    void findArea() {
        System.out.println("Enter radius of sphere:");
        radius = sc.nextDouble();
        area = 4 * pi * radius * radius;
    }

    void findVolume() {
        System.out.println("Enter radius of sphere:");
        radius = sc.nextDouble();
        area = (4.0 / 3.0) * pi * Math.pow(radius, 3);
    }

    void disp() {
        System.out.println("This is an example of abstract");
    }
}

public class RoundShapes {
    public static void main(String[] args) {
        Sphere s = new Sphere();
        s.disp();
        s.findArea();
        s.findVolume();
    }
}
