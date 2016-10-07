

public class Chapter4_10 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int num = 12345;
		int sum = 0;
		
		while(num > 0)
		{
			sum += num%10;
			num /= 10;
		}
	System.out.println("sum = " + sum);
	}
	

}
