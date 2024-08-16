interface calcs {
     void calcsum(int x, int y);

    void calcdiff(int z, int y);
}

interface calc2 {
    void calcmul(int x, int y);
}

class sol1 implements calcs, calc2 {
    @Override
    public void calcsum(int x, int y) {
        System.out.println("sum is " + (x + y));
    }

    public void calcdiff(int x, int y) {
        System.out.println("diff is " + (x - y));
    }

    @Override
    public void calcmul(int x, int y) {
        System.out.println(x * y);
    }
}

public class OverideDemo {
    public static void main(String[] args) {
        sol1 s1 = new sol1();
        s1.calcsum(10, 20);
        s1.calcdiff(10, 5);
        s1.calcmul(100, 10);
        //dynamic method dispatch
        calcs c1 = s1;
        c1.calcsum(100, 100);
        c1.calcdiff(100, 100);
    }

}
