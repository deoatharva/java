class Workingdays 
{
    enum Days
    {
        Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
    }
    public static void weekend(Days d)
    {
        if(d.equals(Days.sunday))
        {
            System.out.println("value :"+d+" is holiday");
        }
        else
        {
            System.out.println("value :"+d+" is a working days");
        }
    }
    public static void main(String[] args) {
        for(Days d:Days.values()){
            weekend(d);
        }
    }
    
}
