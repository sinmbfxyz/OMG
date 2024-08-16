class Box {
    int length;
    int breadth;
    int height;

    public void setvalue(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void getvolume() {
        System.out.println("Volume: " + (this.length * this.breadth * this.height));
    }
}

class boxweight extends Box {
    int weight;

    public void setweight(int weight) {
        this.weight = weight;
    }

    public void displayweight() {
        System.out.println("Weight of box is " + this.weight + "kg");
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        boxweight b = new boxweight();
        boxweight b1 = new boxweight();
        b.setvalue(10, 20, 30);
        b.getvolume();
        b.setweight(20);
        b.displayweight();
        b1.setvalue(12,13,14);
        b1.getvolume();
        b1.setweight(30);
        b1.displayweight();
    }
}