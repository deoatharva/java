class Addd
{
	public static void addd(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void addd(float a,float b)
	{
		System.out.println(a+b);
	} 
	public static void main(String args[])
	{
		Addd ad=new Addd();
		ad.addd(10,20);
		ad.addd(10.5f,20.5f);
	}
}
