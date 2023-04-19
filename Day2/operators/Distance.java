package Bridgelabz.Day2.operators;

import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter x");
//        int x=sc.nextInt();
        int x=Integer.parseInt(args[0]);

//        System.out.println("Enter y");
        int y=Integer.parseInt(args[1]);
//            int y=20;
        double distance=Math.sqrt((x*x) + (y*y));
        System.out.println("Distance between (x,y) = " + distance);
    }

}
