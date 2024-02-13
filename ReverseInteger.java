// given a signed 32 bit integer x return x with its digits reversed x cause the value to go outside the signed 32 bit integer range [-2^(31),2^(31)-1] then return 0
// Assume the environment does not allow you to store 64 bit integers(signed or unsigned).
import java.util.Scanner;
class ReverseInteger {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int x=scan.nextInt();
        int rev=0;
        int absx=Math.abs(x);
        if(x<=0){
            System.out.println("negative number");
            x=x*(-1);
            System.out.println("x value"+x);
            while(x<=0){
                int d=x%10;
                rev=rev*10+d;
                x/=10;
            }
            System.out.println("reversed digit is "+rev);
        }
        else{
            System.out.println("positive number");
            while(x>0){
                int d=x%10;
                rev=rev*10+d;
                x/=10;
            }
            System.out.println("reversed digit is "+rev);
        }
    }
}

