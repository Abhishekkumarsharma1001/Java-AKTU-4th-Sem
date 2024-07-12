
import java.util.Scanner;

public class binaryTodecimal {
    public static void binTodec(){
        Scanner in=new Scanner(System.in);
        int binNo=in.nextInt();
        int myNo=binNo;
        int pow=0;
        int decNum=0;

        while (binNo>0) {
            int lastDigit = binNo%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2, pow));
            pow++;
            binNo=binNo/10;  
            
        }
        System.out.println("decimal of"+myNo+" = "+decNum);

    } 
    public static void main(String[] args) {
        binTodec();
    } 
}
