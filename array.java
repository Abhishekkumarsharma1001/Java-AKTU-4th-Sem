
import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        int marks[]=new int [100];
        Scanner in =new Scanner(System.in);
        marks[0]=in.nextInt();//phy
        marks[1]=in.nextInt();//chem
        marks[2]=in.nextInt();//maths
        marks[3]=in.nextInt();//eng
        System.out.println("phy:"+marks[0]);
        System.out.println("chem:"+marks[1]);
        System.out.println("maths:"+marks[2]);
        System.out.println("eng:"+marks[3]);
        float percentage=(marks[0]+marks[1]+marks[2]+marks[3])/4;
        System.out.println("percentage is:"+percentage+"%");


    }
}