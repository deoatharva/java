// program to except the character from the user and check if it is a consonant or not
import java.util.Scanner;
class Consonant {
    public static void main(String[] args) {
        char ab;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = scan.next().charAt(0);
        switch(ch){
            case 'a':
                 System.out.println("this is not consonant");
                 break;
            case 'e':
                 System.out.println("this is not consonant");
                 break;
            case 'i':
                 System.out.println("this is not consonant");
                 break;
            case 'o':
                 System.out.println("this is not consonant");
                 break;     
            case 'u':
                 System.out.println("this is not consonant");
                 break;
            default:
                 System.out.println("this is consonant");
        }
    }
}
