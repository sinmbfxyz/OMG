class StaticRectangle {
    int length;
    static int breadth;
    static int height;

    public static void Set(int breadth) {
        StaticRectangle.breadth = breadth;
    }

    public static void Display() {
        System.out.println(StaticRectangle.breadth);
        System.out.println(StaticRectangle.height);
    }
    static{
        height = 5*breadth;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // StaticRectangle r1 = new StaticRectangle();
        // r1.length = 10;
        StaticRectangle.Set(30);
        StaticRectangle.Display();
        
    }
}
