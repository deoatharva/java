class IfTest {
    public static void main(String[] args) {
        int a=10,b=5,c=8,d=2;
        float x=6.4f,y=3.0f;
        int a1=a*b+c/d;
        int a2=a*(b+c)/d;
        float a3=a/c;
        float a4=(float) a/c;
        float a5=a/y;
        int a6=a%c;
        float a7=x/y;
        boolean b1=a>b&&c>d;
        boolean b2=a<b&&c>d;
        boolean b3=a<b||c>d;
        boolean b4=!(a-b==c);
        System.out.println("order of evaluation");
        System.out.println("a*b+c/d"+ a1);
        System.out.println("a*(b+c)/d"+ a2);
        System.out.println("a/c"+ a3);
        System.out.println("(float) a/c"+ a4);
        System.out.println("a/y"+ a5);
        System.out.println("a%c"+ a6);
        System.out.println("x/c"+ a7);
        System.out.println("a>b&&c>d"+ b1);
        System.out.println("a<b&&c>d"+ b2);
        System.out.println("a<b||c>d"+ b3);
        System.out.println("!(a-b==c)"+ b4);       
    }
}
