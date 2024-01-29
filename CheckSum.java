import java.util.Scanner;
class CheckSum {
    public static void main(String[] args) {
        byte fv,sv,sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter fv");
        fv=scan.nextByte();
        System.out.println("enter sv");
        sv=scan.nextByte();
        while(fv<=sv){
            sum=(byte)(sum+fv);
            fv++;
        }
        System.out.println("sum:"+sum);        
    }
}
