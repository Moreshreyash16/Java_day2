package Bridgelabz.Day2.whileloop;

public class sumofn {
    static int n=5;
    static int i=0;
    static int sum;
    public static void main(String [] args) {
        while (i < n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
