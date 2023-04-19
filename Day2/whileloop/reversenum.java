package Bridgelabz.Day2.whileloop;

public class reversenum {
        public static void main(String[] args)
        {
            int number = 4520, reverse = 0;
            while(number != 0)
            {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/10;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }

}
