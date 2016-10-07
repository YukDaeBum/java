package 연습문제_2;

public class Chapter5_3 {

	public static void main(String[] args) {
		
		int [] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int [] ball = new int[3]; // 길이가 3 짜리인 배열
		int i = 0;
		int j = 0;
		int tmp = 0;
		int x = 0 ;
		// 다음은 1~9 과 사이의 중복되지 않은 숫자로 이루어진 자리 숫자를 만들
		
	for(x=0; x < 20;x++)
	{ 
		i = (int)(Math.random() * ballArr.length); 
		j = (int)(Math.random() * ballArr.length);

		tmp = ballArr[i];
		ballArr[i] = ballArr[j]; 
		ballArr[j] = tmp;
	}
	System.arraycopy(ballArr,0, ball,0,3);
	//배열에서 원하는 부분만 복사한다는 의미로 
	//(원본, 어느 부분부터 읽어올지 위치, 
	//복사하려는 대상,어느 부분부터 쓸지 시작 위치
	//,원본에서 복사본까지 얼마큼 읽어 올지)
	for(i=0; i<ball.length; i++) 
	{ 
		System.out.print(ball[i]);
	} 
	

	}
}
