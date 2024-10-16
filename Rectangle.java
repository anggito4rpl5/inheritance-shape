package study;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
      // Constructor
      public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Parameter 
    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    // Override
    public void print() {
        System.out.println("length:" + length);
        System.out.println("width:" + width);
    }
    public void luas() {
        System.out.println("Luas : " + (width * length));
    }
    public void keliling() {
        System.out.println("keliling :"  + (width + length + width + length));
    }
    

 
}
