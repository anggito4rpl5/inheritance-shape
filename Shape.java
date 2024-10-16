package study;

public class Shape {
    private String name;
    private String color;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
      // Constructor
      public Shape() {
        this.name = "null";
        this.color = "null";
    }

    // Parameter 
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Override
    public void print() {
        System.out.println("name:" + name);
        System.out.println("color:" + color);
    }
    
}


