import java.util.*;

public class Exception {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        int c = 10;
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("exception division by zero is not possible");
        }
        System.out.println(a/c);

    }
}
