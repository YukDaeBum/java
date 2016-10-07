package 연습문제_2;

public class Chapter5_4 {

	public static void main(String[] args) {
		
	int []answer = { 1,4,4,3,1,4,4,2,1,3,2 };
	int i = 0;
	int j =0;
	
	for(i=0; i < answer.length; i++)
	{
		for(j=0; j<answer[i]; j++)
		{
			System.out.println("*");
		}
		System.out.println();
	}
	


	}

}
