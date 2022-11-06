import java.util.*;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        long factorial = 1;
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0){
            factorial = 1;
        }
        else{
            for(int i=1;i<=num;i++){
                factorial = factorial *i;

            }
        }
        System.out.println("the factorial is : "+factorial);
    }
}
