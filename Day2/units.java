package Bridgelabz.Day2;

public class units{
        static int a=1000;
        public static void main(String[] args) {
            if (a == 10) {
                System.out.println("tens");

            } else if (a == 100) {
                System.out.println("Hundred");
            } else if (a == 1000) {
                System.out.println("Thousand");
            } else if (a == 10000) {
                System.out.println("Ten-Thousand");
            }
            else {
                System.out.println("out of range");
            }
        }
}