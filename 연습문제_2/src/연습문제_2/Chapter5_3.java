package ��������_2;

public class Chapter5_3 {

	public static void main(String[] args) {
		
		int [] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int [] ball = new int[3]; // ���̰� 3 ¥���� �迭
		int i = 0;
		int j = 0;
		int tmp = 0;
		int x = 0 ;
		// ������ 1~9 �� ������ �ߺ����� ���� ���ڷ� �̷���� �ڸ� ���ڸ� ����
		
	for(x=0; x < 20;x++)
	{ 
		i = (int)(Math.random() * ballArr.length); 
		j = (int)(Math.random() * ballArr.length);

		tmp = ballArr[i];
		ballArr[i] = ballArr[j]; 
		ballArr[j] = tmp;
	}
	System.arraycopy(ballArr,0, ball,0,3);
	//�迭���� ���ϴ� �κи� �����Ѵٴ� �ǹ̷� 
	//(����, ��� �κк��� �о���� ��ġ, 
	//�����Ϸ��� ���,��� �κк��� ���� ���� ��ġ
	//,�������� ���纻���� ��ŭ �о� ����)
	for(i=0; i<ball.length; i++) 
	{ 
		System.out.print(ball[i]);
	} 
	

	}
}
