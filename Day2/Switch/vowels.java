package Bridgelabz.Day2.Switch;
import java.util.Scanner;
public class vowels {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Letter");
        String letter = sc.nextLine();

        switch (letter) {
            case "a":
                System.out.println(letter + " is a Vowel");
                break;
            case "e":
                System.out.println(letter + " is a Vowel");
                break;
            case "i":
                System.out.println(letter + " is a Vowel");
                break;
            case "o":
                System.out.println(letter + " is a Vowel");
                break;
            case "u":
                System.out.println(letter + " is a Vowel");
                break;

            default:
                System.out.println(letter + " is a Consonant");
        }
    }
}