import java.util.Calander;
class Calendar45
{
	public static void main(String[] args) {
		String months[]={
            "jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"
        };
        Calander calendar=Calendar.getInstance();
        System.out.println("Date :");
        System.out.println(months[calendar.get(Calander.MONTH)]);
        System.out.println(" "+caledar.get(Calender.DATE)+" ");
        System.out.println(calendar.get(Calander.YEAR));
        System.out.println("time :");
        System.out.println(calendar.get(Calander.HOUR)+" : ");
	}
}