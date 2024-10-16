package study;


public class Cube extends Rectangle {
    private int height;

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
     // Constructor
     public Cube() {
        this.height = 0;
      
    }

    // Parameter 
    public Cube(String name, String color, int length, int width, int height) {
        super(name, color, length, width);
        this.height = height;
       
    }

    // Override
    public void print() {
        System.out.println("height:" + height);
       
    }
    public void volume(int width, int length, int height) {
        System.out.println("volume : " + (width * length*height));
    }
    public void luas(int width, int length, int height) {
        System.out.println("luas permukaan : " + (2 * (width * length+ width*height+ length*height) ));
    }
    

}
