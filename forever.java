
import java.util.Scanner;
class forever {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = scan.nextInt();
        int i=1;
        if(a!=i){
        String str = "$ \n".repeat(a);
        System.out.println(str.repeat(i));
        i++;
        }
        
    }
}

