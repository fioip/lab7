package Inheritance;

public class Shape {
    public double calculateAria() {
        return 0.0;
    }
}

class Circle extends Shape {
    double raza;

    public Circle(double raza) {
        this.raza = raza;
    }

    @Override
    public double calculateAria() {
        return Math.PI * raza * raza;
    }

    public static void main(String[] args) {
        Circle cerc = new Circle(5.5);
        System.out.println("Arie cerc: "+cerc.calculateAria());
    }
}

class Rectangle extends Shape {
    int latime, inaltime;

    public Rectangle(int latime, int inaltime) {
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public double calculateAria() {
        return latime * inaltime;
    }

    public static void main(String[] args) {
        Rectangle dreptunghi = new Rectangle(10, 15);
        System.out.println("Arie dreptunghi: "+dreptunghi.calculateAria());
    }

}
