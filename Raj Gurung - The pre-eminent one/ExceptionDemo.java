import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
            int div = x / y;
            System.out.println(div);

            int[] arr = new int[2];
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 40;
        } catch (ArithmeticException a) {
            System.out.println("Error");
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("Size exceeded");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This is finally");
        }
        System.out.println("Out of catch");
    }
}