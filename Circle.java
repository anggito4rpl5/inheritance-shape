package study;

public class Circle extends Shape{
    private int radius;

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
     // Constructor
     public Circle() {
        this.radius = 0;
        
    }

    // Parameter 
    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
        
    }

    public void luas() {
        System.out.println("Luas : " + (3.14 * radius * radius));
    }

    // Override
    public void print() {
        System.out.println("Radius:" + radius);
      
    }
    public void keliling() {
        System.out.println("keliling :"  + (2 * 3.14 * radius));


    }
}
