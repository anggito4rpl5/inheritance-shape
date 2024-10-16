package study;

import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        Scanner Belajar = new Scanner(System.in);
        System.out.println("        Selamat Datang      ");
        System.out.println("(-------ingin menghitung apa-------)");
        System.out.println("1.RECTANGLE\t2.CIRCLE");
        String choose = Belajar.nextLine();
        if (choose.equals("1")) {
            System.out.print("Nama : ");
            String name = Belajar.nextLine();
            System.out.print("Color : ");
            String color = Belajar.nextLine();
            System.out.println("1.Rectangle  atau  2.Cube");
            int choose2 = Belajar.nextInt();
            Belajar.nextLine();
            if (choose2 == 1) {
                System.out.print("lenght : ");
                int length = Belajar.nextInt();
                Belajar.nextLine();
                System.out.print("width : ");
                int width = Belajar.nextInt();
                Belajar.nextLine();

                System.out.println("      (berikut hasilnya)");
                Rectangle rectangle = new Rectangle(name, color, length, width);
                System.out.println("           ---------");
                rectangle.print();
                System.out.println("           ---------");
                rectangle.luas();
                System.out.println("           ---------");
                rectangle.keliling();

            } else if (choose2 == 2) {
                System.out.println();
                System.out.println("-- cube --");
                System.out.print("length :   ");
                int length = Belajar.nextInt();
                System.out.print("width :   ");
                int width = Belajar.nextInt();
                System.out.print("height :   ");
                int height = Belajar.nextInt();
                Belajar.nextLine();

                Cube cube = new Cube(name, color, length, width, height);
                System.out.println("---------");
                cube.print();
                System.out.println("----------");
                cube.volume(width, length, height);
                cube.luas(width, length, height);

            }

        } else if (choose.equals("2")) {
            System.out.println("lingkaran");

            System.out.print("Nama : ");
            String name = Belajar.nextLine();
            System.out.print("Color : ");
            String color = Belajar.nextLine();
            System.out.print("radius : ");
            int radius = Belajar.nextInt();
            Belajar.nextLine();

            System.out.println(" (berikut hasilnya)");
            Circle circle = new Circle(name, color, radius);
            System.out.println("---------");
            circle.print();
            circle.luas();
            circle.keliling();

            Belajar.close();

        }
    }

}
