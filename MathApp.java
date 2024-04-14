class MathOp
{
	static float mul(float x,float y)
	{
		return x*y;
	}
	static float divide (float x,float y)
	{
		return x/y;
	}
}
class MathApp
{
	public static void main(String[] args) {
		float a = MathOp.mul(4.0f,5.0f);
		float b = MathOp.divide(a,2.0f);
		System.out.println("b = "+b);
	}
}
