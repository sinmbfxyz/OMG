abstract class Calculation {
    private int x;
    private int y;
    
    public Calculation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void calcsum(){
        System.out.println(x+y);
    }

    abstract void calcdiff(int x, int y);

    abstract void calcmulti(int x, int y);
}

class soln extends Calculation {
    private int z;

    public soln (int z, int x, int y) {
        //super
        super(x,y);
        this.z = z;
    }

    public void calcSquare() {
        System.out.println(z * z);
    }

    public void calcdiff(int x,int y){
        System.out.println(x-y);
    }
        public void calcmulti(int x,int y){
            System.out.println(z*z);
        }
    
}

public class AbstractdDemo {
    public static void main(String[] args) {
        soln s1 = new soln(10, 30, 20);
        s1.calcsum();
        s1.calcdiff(40, 50);
        s1.calcmulti(5, 10);
    }
}