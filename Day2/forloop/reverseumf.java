package Bridgelabz.Day2.forloop;

public class reverseumf {
    public static void main (String[] args){
        int num=545;
        int temp;
        temp=num;
        int rem;
        int rev=0;
        for(int i=0;i<=temp;i++) {
            rem = temp % 10;
            rev = (rev * 10) + rem;
            temp = temp / 10;


            //System.out.println(rev);
        }
        if(num==rev) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
      }

    }
}