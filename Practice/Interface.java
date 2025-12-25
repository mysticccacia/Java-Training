interface shapes{
    void area();
    void parimeter();
}

class Circle implements shapes{
    private double radius;
    public Circle(double r){
        this.radius = r;
    }
    public void area()
    {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    public void parimeter()
    {
        System.out.println("Perimeter of Circle: " + (2 * 3.14 * radius));
    }
}

class Rectangle implements shapes{
    private double length;
    private double breadth;
    public Rectangle(double l, double b){
        this.length = l;
        this.breadth = b;
    }
    public void area()
    {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public void parimeter()
    {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }
}

public class Interface {
    public static void main(String[] args) {
        shapes c = new Circle(5);
        c.area();
        c.parimeter();

        shapes r = new Rectangle(4, 6);
        r.area();
        r.parimeter();
    }
}