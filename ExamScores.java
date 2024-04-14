public class ExamScores
{
	public static void main(String[] args) {
		int [] [] score={
			{72,82,91},
			{95,89,90},
			{77,65,73},
			{97,92,93},
		};
		studnentAvg(scorces);
	}
	public static void studnentAvg(int [][] inArray)
	{
		double tottal,avg;
		for(int i=0;i<inArray.length;i++){
			total=total+inArray[i][j];
		}
		avg=total/inArray[i].length;
		System.out.println("average for student "+(i+1)+":%5.2f"+avg);
	}
}
