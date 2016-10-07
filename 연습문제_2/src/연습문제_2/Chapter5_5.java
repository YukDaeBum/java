package 연습문제_2;

public class Chapter5_5 {

	public static void main(String[] args) {
		
		char[][] star = { 
				{'*','*',' ',' ',' '}, 
				{'*','*',' ',' ',' '}, 
				{'*','*','*','*','*'}, 
				{'*','*','*','*','*'} };
		
		char [][]result = new char[star[0].length][star.length];  //5*4 배열
		// 시계방향ㅇ,로 90도 돌리 배열 생성
		
		for(int i=0; i < star.length;i++)
		{ 
			for(int j=0; j < star[i].length;j++) 
		
			{ 
				System.out.print(star[i][j]); 
			}
			System.out.println(); 
		
		}
		System.out.println(); 
		for(int i=0; i < star.length;i++) 
		{ 
			for(int j=0; j < star[i].length;j++)
			{ 
				int x = j; int y = star.length-1-i;
				result[x][y]=star[i][j];
			}
		} 
		for(int i=0; i < result.length;i++)
		{
			for(int j=0; j < result[i].length;j++)
			{
				System.out.print(result[i][j]); 
				}
			System.out.println(); 
		} 
	}

}
