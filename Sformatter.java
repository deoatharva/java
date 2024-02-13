// string formatter
class Sformatter {
    public static void main(String args[]) {
        String str="hello world";
        String s=String.format("My Comapny name is %s",str);
        
        String s1=String.format("My answer is %.8f",47.6534);
        
        String s2=String.format("My answer is %15.8f",47.6534);
        System.out.println(s+s1+s2);
        
    }
}
