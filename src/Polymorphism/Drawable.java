package Polymorphism;

public class Drawable {
    public void draw() {
        System.out.println("Urmeaza sa desenam!");
    }
}

class Circle extends Drawable{
    public void draw() {
        System.out.println("Vom desena un cerc! ⚫");
    }
}

class Square extends Drawable{
    public void draw() {
        System.out.println("Vom desena un patrat! ⬛");
    }
}

class Triangle extends Drawable{
    public void draw() {
        System.out.println("Vom desena un triunghi! ▲");
    }
}

class Main {
    public static void main(String[] args) {
        Drawable drawObj = new Drawable();
        Drawable circleObj = new Circle();
        Drawable squareObj = new Square();
        Drawable triangleObj = new Triangle();

        drawObj.draw();
        circleObj.draw();
        squareObj.draw();
        triangleObj.draw();
    }
}