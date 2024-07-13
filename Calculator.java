
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("enter a:");
        int a=in.nextInt();
        System.out.println("enter b:");
        int b=in.nextInt();
        System.out.println("enter operator:");
        char operator=in.next().charAt(0);//in.next() se saari string aati h isliye charAt ka use kiya h
        switch (operator){
            case '+' :System.out.println(a+b);
                 break;
            case '-' :System.out.println(a-b);
                 break;
            case '*' :System.out.println(a*b);
                 break;
            case '/' :System.out.println(a/b);
                 break;
            case '%':System.out.println(a%b);
                 break;
            default:System.out.println("wrong operator");        
        }
    }
}
