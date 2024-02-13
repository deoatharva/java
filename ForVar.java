class ForVar 
{
    public static void main(String[] args) 
    {
        int i;
        boolean done = false;
        i=0;
        for(;!done;)
        {
            System.out.println("Hello, World!");
            if(i==10)
            {
                done=true;
                i++;
            }    
        }
    }
}
