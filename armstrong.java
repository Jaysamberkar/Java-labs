import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        int ognumber,number=0,remainder,result =0;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        ognumber = number;
        while(ognumber != 0){
            remainder = ognumber%10;
            result += Math.pow(remainder,3);
            ognumber /= 10;
        }
        if(result==number){
            System.out.println(number +" is an Armstrong mumber ");
        }
        else{
            System.out.println(number +" is not Armstrong number");
        }
    }
}
