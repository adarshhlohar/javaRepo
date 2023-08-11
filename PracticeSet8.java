class Cylinder {
    private int radius;
    private int height;

    // constructor default
    Cylinder() {
        radius = 19;
        height = 21;
    }

    Cylinder(int height, int radius) { // using the constructor with Parameter
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Rectangle {
    private int length;
    private int breadth;

    Rectangle() {
        length = 4;
        breadth = 5;
    }

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int Area(){
        return length*breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class PracticeSet8 {
    public static void main(String[] args) {
        /*
         * // Problem 1
         * Cylinder newCylinder = new Cylinder();
         * newCylinder.setHeight(12);
         * newCylinder.setRadius(9);
         * System.out.println(newCylinder.getHeight());
         * System.out.println(newCylinder.getRadius());
         * 
         * // Problem 2
         * Cylinder myCylinder = new Cylinder(12, 9);
         * System.out.println(myCylinder.getRadius());
         * System.out.println(myCylinder.getHeight());
         * 
         * // Problem 3
         * Cylinder myCylinder1 = new Cylinder();
         * System.out.println(myCylinder1.getHeight());
         * System.out.println(myCylinder1.getRadius());
         * 
         * 
         * // Problem 4
         * Cylinder obj = new Cylinder(12,9);
         * System.out.println(obj.surfaceArea());
         * System.out.println(obj.volume());
         */

        // Problem 5
        Rectangle obj2 = new Rectangle();
        System.out.println(obj2.getBreadth());
        System.out.println(obj2.getLength());
        System.out.println("The area of Rectangle obj2 is : "+ obj2.Area());

        // Problem 6
        Rectangle obj3 = new Rectangle(3,4);
        System.out.println("The area of Rectangle obj3 is : "+ obj3.Area());
    }
}
